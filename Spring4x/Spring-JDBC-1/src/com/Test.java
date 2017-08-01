package com;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prod.dao.ProductDaoImpl;
import com.prod.model.Product;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		ProductDaoImpl pd = ac.getBean("prodDao", ProductDaoImpl.class);

		// Map<String, Object> row=pd.findProduct("P001");
		// System.out.println(row);

		// List<Map<String,Object>> prods= pd.listProds();
		// System.out.println(prods);
		// System.out.println(prods.size()+" Fetched from DB");

		
		/*List<Product> prods= pd.displayAll();
		
		for(Product prod:prods) {
			System.out.println(prod.getProdId());
			System.out.println(prod.getProdName());
			System.out.println(prod.getPrice());
			System.out.println("------------------");
		}
		System.out.println("Size:  "+prods.size());*/
		
		//pd.backUpRecords();
		
		//Product prod = pd.findById("P001");

		//System.out.println(prod.getProdId());
		//System.out.println(prod.getProdName());
		//System.out.println(prod.getPrice());

		Product prod=new Product();
		prod.setProdId("P0001");
		prod.setProdName("Ball Pen");
		prod.setPrice(500);
		
		pd.saveProduct(prod);
		
		//pd.updateProduct(prod);
		//pd.deleteProduct("P001");
		
		
		ac.registerShutdownHook();

		System.out.println("--- Done ---");

	}

}
