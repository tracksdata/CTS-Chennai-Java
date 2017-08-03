package com.prod.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prod.dao.ProductDao;
import com.prod.model.Product;

@Service("updateService")
public class UpdateProductServiceImpl implements UpdateProductService {

	@Autowired
	private ProductDao prodDao;
	
	@Override
	@Transactional
	public void updateProduct(Product prod) {
		prodDao.updateProduct(prod);
	}
	
}
