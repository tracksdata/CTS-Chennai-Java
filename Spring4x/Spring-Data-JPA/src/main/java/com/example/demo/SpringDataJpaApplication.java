package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.dao.ProductDaoImpl;
import com.example.demo.model.Product;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca= SpringApplication.run(SpringDataJpaApplication.class, args);
		 ProductDaoImpl p= ca.getBean("prodDao",ProductDaoImpl.class);
		 Product pr=new Product();
		 pr.setProdId("P98");
		 pr.setProdName("My Laptop");
		 pr.setPrice(3444);
		 p.save(pr);
		 
		 /*List<Product> prods= p.findAll();
	
		 
		 for(Product prod:prods) {
			 System.out.println(prod.getProdName());
		 }*/
	}
}
