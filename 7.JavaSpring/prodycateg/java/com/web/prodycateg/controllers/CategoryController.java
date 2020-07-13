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
public class CategoryController {
	private final MainService service;
	
	public CategoryController(MainService service) {
		this.service = service;
	}
	
	@RequestMapping("/categories/new")
	public String Index(Model model, @ModelAttribute("category") Category category) {
		List<Category> c = service.showCategories();
		model.addAttribute(category);
		model.addAttribute("categories", c);
		return "newCatego.jsp";
	}
	@RequestMapping("/categories/addCategory")
	public String Form(@Valid @ModelAttribute("category") Category category) {
		service.create(category);
		return "redirect:/categories/new";
	}
	
	@RequestMapping("/categories/{id}")
	public String Show(Model model, @PathVariable("id") Long id) {
		Category c = service.findOneCate(id);
		List<Product> p = service.showProducts();
		List<Product> p1 = new ArrayList<Product>();
		for(Product prod : p) {
			if(!c.getProducts().contains(prod)) p1.add(prod);
		}
		model.addAttribute("categoId", id);
		model.addAttribute("category", c);
		model.addAttribute("products", p1);
		return "showCatego.jsp";
	}
	
	@RequestMapping(value="/categories/addCategoProd", method=RequestMethod.POST)
	public String Add(@Valid 
			@RequestParam("prodId") Long prodId,
			@RequestParam("categoId") Long categoId) {
		Product p = service.findOneProd(prodId);
		Category c = service.findOneCate(categoId);
		CategoryProduct cp = new CategoryProduct(p,c);
		service.create(cp);
		return "redirect:/categories/"+categoId;
	}
}

















