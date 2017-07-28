package com;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prod.model.Product;
import com.prod.service.ListProductService;
import com.prod.service.SaveProductService;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");

		Product prod = new Product();

		prod.setProdId("P001");
		prod.setProdName("Book");
		prod.setPrice(34);

		SaveProductService saveProd = ac.getBean("saveProd", SaveProductService.class);
		saveProd.saveProduct(prod);
		
		
		ListProductService listService=ac.getBean("listProds",ListProductService.class);
		List<Product> prods= listService.listAll();
		
		for(Product p:prods) {
			System.out.println(p.getProdName());
		}
		
		
		ac.registerShutdownHook();
		
	}

}
