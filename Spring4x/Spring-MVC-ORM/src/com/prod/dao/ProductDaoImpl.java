package com.prod.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.prod.model.Product;

@Repository("prodDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	@Override

	public void saveProduct(Product prod) {
		Session ses = sf.getCurrentSession();
		ses.save(prod);
		System.out.println("--- Record saved");
	}

	@Override
	public List<Product> listAll() {

		Session ses = sf.getCurrentSession();

		Query qry=ses.createQuery("from Product");
		
		List<Product> prods=qry.list();
		
		return prods; 
	}
	
	
	
	public void updateProduct(Product prod) {
		Session ses = sf.getCurrentSession();
		ses.update(prod);
		System.out.println("-- Product Updated");
		
	}
	
	public Product findProduct(String prodId) {
		Session ses = sf.getCurrentSession();
		 
		Product prod= (Product) ses.get(Product.class, prodId);
		//System.out.println("-- Dao: "+prod.getProdName());
		if(prod==null)
			System.out.println("Null Pinter");
		
		return prod;
	}
	

}
