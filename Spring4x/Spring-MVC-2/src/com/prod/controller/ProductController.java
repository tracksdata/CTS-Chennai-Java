package com.prod.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prod.model.Product;

@Controller
public class ProductController {

	/*
	 * @RequestMapping("saveProduct") public void
	 * saveProduct(@RequestParam("prodId") String prodId, @RequestParam("prodName")
	 * String prodName,
	 * 
	 * @RequestParam("price") double price) { System.out.println("Product Id: " +
	 * prodId); System.out.println("product Name: " + prodName);
	 * System.out.println("Price: " + price);
	 * 
	 * }
	 */

	@RequestMapping("saveProduct_v1")
	public ModelAndView saveProduct_v1(@ModelAttribute("blabla") Product prod) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display");
		mav.addObject("product", prod);
		return mav;

	}

	@RequestMapping("updateProd")
	public ModelAndView updateProd(@ModelAttribute("p1") Product prod) {

		prod.setProdId("P001");
		prod.setProdName("Pen");
		prod.setPrice(45);
		
		List<String> cities=new ArrayList<>();
		cities.add("HYD");
		cities.add("CHN");
		cities.add("GOA");
		cities.add("BGR");
		cities.add("MRD");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("UpdateProduct");
		mav.addObject("product", prod);
		mav.addObject("msg", "Your Message");
		mav.addObject("mycities", cities);
		return mav;

	}
	
	@RequestMapping("updateProduct")
	public void updateProduct(@ModelAttribute("blabla")Product prod) {
		
		System.out.println(prod.getProdId()+" is Updated");
	}

}
