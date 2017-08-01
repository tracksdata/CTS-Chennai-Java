package com.prod.dao;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.prod.model.Product;

@Repository("prodDao")
public class ProductDaoImpl {

	@Autowired
	private JdbcTemplate jt;

	

	public void saveProduct(Product prod) {
		String q1="insert into product values(?,?,?)";
		jt.update(q1,prod.getProdId(),prod.getProdName(),prod.getPrice());
		System.out.println("--- Product is saved");
	}

	// fetch single rec using Domain Objects
	public Product findById(String prodId) {

		String qry = "select * from product where product_id=?";
		Product prod = jt.queryForObject(qry, new FindProduct(), prodId);

		return prod;
	}

	public List<Map<String, Object>> listProds() {

		String q1 = "select * from product";
		List<Map<String, Object>> prods = jt.queryForList(q1);

		return prods;
	}

	// fetch single rec with map
	public Map<String, Object> findProduct(String prodId) {

		String qry = "select * from product where product_id=?";
		Map<String, Object> row = jt.queryForMap(qry, prodId);
		return row;
	}

	// fecth all recs using RowMapper
	public List<Product> listAllProducts() {

		String q1 = "select * from product";

		List<Product> prods = jt.query(q1, new ListAllProducts());

		return prods;
	}

	// RowCallBackHandler Demo
	public void backUpRecords() {

		String q1 = "select * from product";

		jt.query(q1, new BackupRecords());

	}

	// ResultSetExtractor Demo

	public List<Product> displayAll() {
		String qry = "select * from product";
		List<Product> prods = jt.query(qry, new DisplayAllRecords());

		return prods;
	}

	// updating product
	public void updateProduct(Product prod) {
		
		String q1="update product set product_name=?,price=? where product_id=?";
		jt.update(q1,prod.getProdName(),prod.getPrice(),prod.getProdId());
		System.out.println("--- record update success");
	}
	
	
	// delete product with proodId
		public void deleteProduct(String prodId) {
			
			String q1="delete from product where product_id=?";
			jt.update(q1,prodId);
			System.out.println("--- record deletion success");
		}
	
} // end of Dao

// ResultsetExtractor interface demo
class DisplayAllRecords implements ResultSetExtractor<List<Product>> {
	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {

		List<Product> prods = new ArrayList<>();

		while (rs.next()) {
			Product prod = new Product();
			prod.setProdId(rs.getString(1));
			prod.setProdName(rs.getString(2));
			prod.setPrice(rs.getDouble(3));
			prods.add(prod);
		} // end of loop
		return prods;
	}
}

// RowCallbackHander demo for serialization
class BackupRecords implements RowCallbackHandler {

	@Override
	public void processRow(ResultSet rs) throws SQLException {

		List<Product> prods = new ArrayList<>();
		try {

			FileOutputStream fos = new FileOutputStream("d:/test123.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			while (rs.next()) {
				Product prod = new Product();
				prod.setProdId(rs.getString(1));
				prod.setProdName(rs.getString(2));
				prod.setPrice(rs.getDouble(3));

				prods.add(prod);
			} // end of loop

			oos.writeObject(prods);
			oos.close();
			fos.close();
			System.out.println("--- records backed up");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}

// RowMapper with Single rec demo
class FindProduct implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product prod = new Product();
		prod.setProdId(rs.getString(1));
		prod.setProdName(rs.getString(2));
		prod.setPrice(rs.getDouble(3));

		return prod;
	}

} // end of FindProduct class

// RowMapper with multiple records
class ListAllProducts implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		Product prod = new Product();
		prod.setProdId(rs.getString(1));
		prod.setProdName(rs.getString(2));
		prod.setPrice(rs.getDouble(3));

		return prod;
	}

}
