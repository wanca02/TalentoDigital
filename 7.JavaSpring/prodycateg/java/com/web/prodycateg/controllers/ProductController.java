package com.web.prodycateg.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.prodycateg.models.Category;
import com.web.prodycateg.models.CategoryProduct;
import com.web.prodycateg.models.Product;
import com.web.prodycateg.services.MainService;

@Controller
public class ProductController {
	private final MainService service;
	
	public ProductController(MainService service) {
		this.service = service;
	}
	
	@RequestMapping("/products/new")
	public String Index(Model model,@ModelAttribute("product") Product product) {
		List<Product> p = service.showProducts();
		model.addAttribute(product);
		model.addAttribute("products",p);
		return "newProd.jsp";
	}
	@RequestMapping("/products/addProduct")
	public String Form(@Valid @ModelAttribute("product") Product product) {
		service.create(product);
		return "redirect:/products/new";
	}
	
	@RequestMapping("/products/{id}")
	public String Show(Model model, @PathVariable("id") Long id) {
		Product p = service.findOneProd(id);
		List<Category> c = service.showCategories();
		List<Category> c1 = new ArrayList<Category>();
		for(Category cate : c) {
			if(!p.getCategories().contains(cate)) c1.add(cate);
		}
		model.addAttribute("prodId", id);
		model.addAttribute("product", p);
		model.addAttribute("categories", c1);
		return "showProd.jsp";
	}
	
	@RequestMapping(value="/products/addProdCatego", method=RequestMethod.POST)
	public String Add(@Valid 
			@RequestParam("categoId") Long categoId,
			@RequestParam("prodId") Long prodId) {
		Product p = service.findOneProd(prodId);
		Category c = service.findOneCate(categoId);
		CategoryProduct cp = new CategoryProduct(p,c);
		service.create(cp);
		return "redirect:/products/"+prodId;
	}
}

















