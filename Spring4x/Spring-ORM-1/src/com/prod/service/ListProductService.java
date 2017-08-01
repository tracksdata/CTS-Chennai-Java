package com.prod.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.prod.model.Product;

public interface ListProductService {

	List<Product> listAll();

}