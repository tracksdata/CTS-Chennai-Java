package com.prod.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prod.model.Product;

@Repository("prodDao")
public class ProductDaoImpl implements ProductDao,TestDao {

	@Override
	public void saveProduct(Product prod) {
		System.out.println(prod.getProdName() + "Saved to DB");
	}

	@Override
	public List<Product> findAll() {

		Product prod = new Product();
		prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setPrice(34);
		List<Product> list=new ArrayList<>();
		
		list.add(prod);
		
		
		return list;
	}

	@Override
	public void testMethod() {
		// TODO Auto-generated method stub
		
	}

}
