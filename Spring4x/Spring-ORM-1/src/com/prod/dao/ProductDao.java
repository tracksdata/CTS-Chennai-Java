package com.prod.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.prod.model.Product;

public interface ProductDao {

	void saveProduct(Product prod);
	List<Product> listAll();
	public Product findProduct(String prodId);
	public void updateProduct(Product prod);

}