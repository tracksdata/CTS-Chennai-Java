package com.prod.dao;

import java.util.List;

import com.prod.model.Product;

public interface ProductDao {

	void saveProduct(Product prod);

	List<Product> findAll();

}