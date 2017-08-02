package com.prod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller

public class ProductController {

	@RequestMapping(value = "one.htm")
	public void method1() {
		System.out.println("--- method1 of ProductController");
	}

	@RequestMapping(value = "two.htm")
	public String method2() {
		System.out.println("--- method2 of ProductController");
		return "hello";
	}
	
	@RequestMapping(value = "thr.htm")
	public String method3(Model xyz) {
		System.out.println("--- method3 of ProductController");
		String cities[]= {"Chennai","HYD","Pune","Delhi"};
		xyz.addAttribute("prodName", "Pen");
		xyz.addAttribute("mycities", cities);
		
		return "display";
	}
	
	@RequestMapping(value = "four.htm")
	public ModelAndView method4() {
		System.out.println("--- method4 of ProductController");
		String cities[]= {"Chennai","HYD","Pune","Delhi"};
		ModelAndView mav=new ModelAndView();
	
		mav.setViewName("disp");
		mav.addObject("empName", "Praveen Reddy S");
		mav.addObject("mycities", cities);
		return mav;
	}


}
