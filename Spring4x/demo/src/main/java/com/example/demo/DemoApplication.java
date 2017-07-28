package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;



@SpringBootApplication
@ComponentScan(value= {"com.example.demo.dao"})
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac= SpringApplication.run(DemoApplication.class, args);

/*		Employee emp=cac.getBean("empDao",Employee.class);
		emp.testMethod();
*/		
	  ProductDao prod= cac.getBean("prodDao",ProductDao.class);
		
	 List<Product> prods= prod.findAll();		
		
	 for(Product p:prods) {
		 System.out.println(p.getProdName());
	 }
		
		
	}
}
