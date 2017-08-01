package com;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prod.dao.ProductDao;
import com.prod.dao.ProductDaoImpl;
import com.prod.model.Product;
import com.prod.service.ListProductService;
import com.prod.service.SaveProductService;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		
		SaveProductService saveService= ac.getBean("saveProdService",SaveProductService.class);
		ListProductService listProds=ac.getBean("listProds",ListProductService.class);
		
		/*	
		Product prod=new Product();
		
		prod.setProdId("P1015");
		prod.setProdName("New Mobile");
		prod.setPrice(123321);*/
		
		//saveService.saveProduct(prod);
		//saveService.saveProduct(prod);
	
		//saveService.processProduct(prod);
		
		
		List<Product> prods= listProds.listAll();
		
		for(Product prod:prods) {
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
			System.out.println("-----------------------");
		}
		
		
		
	}

}
