package com.prod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prod.dao.ProductDao;
import com.prod.model.Product;
@Service("saveProd")
public class SaveProductServiceImpl implements SaveProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public void saveProduct(Product prod) {

		prodDao.saveProduct(prod);
	}

}
