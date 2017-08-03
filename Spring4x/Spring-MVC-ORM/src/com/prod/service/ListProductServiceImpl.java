package com.prod.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prod.dao.ProductDao;
import com.prod.model.Product;
@Service("listProds")
public class ListProductServiceImpl implements ListProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	@Transactional
	public List<Product> listAll() {

		return prodDao.listAll();
	}

}
