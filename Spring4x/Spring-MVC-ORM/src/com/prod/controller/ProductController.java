package com.prod.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.prod.model.Product;
import com.prod.service.FindProductService;
import com.prod.service.ListProductService;
import com.prod.service.SaveProductService;
import com.prod.service.UpdateProductService;

@Controller
public class ProductController {

	@Autowired
	private SaveProductService saveService;
	@Autowired
	private ListProductService listService;

	@Autowired
	private FindProductService findService;
	
	@Autowired
	private UpdateProductService updateService;

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

	@RequestMapping(value = "listProd")
	public ModelAndView listProds() {
		ModelAndView mav = new ModelAndView();

		List<Product> prods = listService.listAll();
		mav.addObject("products", prods);
		mav.setViewName("Products");

		return mav;
	}

	@RequestMapping("saveProduct_v1")
	public ModelAndView saveProduct_v1(@ModelAttribute("blabla") Product prod) {
		ModelAndView mav = new ModelAndView();

		saveService.saveProduct(prod);

		mav.setViewName("display");
		mav.addObject("product", prod);
		return mav;

	}

	@RequestMapping(value = "findProd")
	public ModelAndView findProduct(@RequestParam("prodId")String prodId,@RequestParam("page")String page) {
		ModelAndView mav = new ModelAndView();
		System.out.println("Resource: "+page);
		String viewName="";
		Product prod = findService.findProduct(prodId);
		String msg="";
		if(prod==null)
		msg="No Data Found with "+prodId+"";
		mav.addObject("product", prod);
		if(page.equals("update"))
			viewName="Search";
		if(page.equals("search"))
			viewName="SearchProduct";
		mav.setViewName(viewName);
		mav.addObject("msg", msg);
		return mav;

	}

	
	@RequestMapping("updateProduct")
	public String updateProduct(@ModelAttribute("blabla") Product prod) {
		updateService.updateProduct(prod);
		
		return "Products";
	}
	
	@RequestMapping("search_v1")
	public ModelAndView find_v1(@ModelAttribute("ids")Product product) {
		ModelAndView mav=new ModelAndView();	
	 List<Product> prods=listService.listAll();
	 List<String> prodIds=new ArrayList<>();
	 for(Product prod:prods) {
		 prodIds.add(prod.getProdId());
	 }
		mav.addObject("ids",prodIds);
		mav.setViewName("SearchProduct_v1");
		return mav;
	}

}
