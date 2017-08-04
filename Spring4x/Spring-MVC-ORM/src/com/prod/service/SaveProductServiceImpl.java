package com.prod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.prod.dao.ProductDao;
import com.prod.model.Product;

@Service("saveProdService")
public class SaveProductServiceImpl implements SaveProductService {

	@Autowired
	//@Qualifier(value="c1")
	private ProductDao prodDao;
	
	@Override
	@Transactional
	public void saveProduct(Product prod) {
		prodDao.saveProduct(prod);
		
	}
	
	@Transactional
	public void processProduct(Product prod) {
		
		Product p1= prodDao.findProduct("P0001");
		System.out.println("-- test: "+p1.getProdName());
		p1.setProdName("New N4");
		p1.setPrice(444);
		
		prodDao.updateProduct(p1);
		
		prodDao.saveProduct(prod);
		
		
	}
	
}
