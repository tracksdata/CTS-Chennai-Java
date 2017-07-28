package com.prod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prod.dao.ProductDao;
import com.prod.model.Product;

@Service("listProds")
public class ListProductServiceImpl implements ListProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public List<Product> listAll() {

		return prodDao.findAll();
		
	}

}
