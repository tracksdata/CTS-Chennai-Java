package com.prod.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prod.dao.ProductDao;
import com.prod.model.Product;

@Service("findProd")
public class FindProductServiceImpl implements FindProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	@Transactional
	public Product findProduct(String prodId) {

		return prodDao.findProduct(prodId);
	}

}
