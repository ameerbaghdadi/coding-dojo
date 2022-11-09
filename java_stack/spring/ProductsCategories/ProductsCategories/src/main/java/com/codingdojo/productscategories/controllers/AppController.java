package com.codingdojo.productscategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.productscategories.models.Category;
import com.codingdojo.productscategories.models.Product;
import com.codingdojo.productscategories.services.AppService;


@Controller
public class AppController {
	 private final AppService appService;
	 public AppController(AppService appService){
	     this.appService = appService;
	 }
	 
	 @GetMapping("/")
	 public String index( Model model) {
		 model.addAttribute("products", appService.allProducts());
		 model.addAttribute("categories", appService.allCategories());
		 return "HomePage.jsp";
	 }
	 
	 @GetMapping("/products/new")
	 public String newProduct(@ModelAttribute("product") Product product) {
		 return "NewProduct.jsp";
	 }
	 
	 @PostMapping(value="/product")
	 public String createProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		 if (result.hasErrors()) {
	         return "NewProduct.jsp";
	     } else {
	         appService.createProduct(product);
	         return "redirect:/";
	     }
	 }
	 
	 @GetMapping("/categories/new")
	 public String newCategory(@ModelAttribute("category") Category category) {
		 return "NewCategory.jsp";
	 }
	 
	 @PostMapping(value="/category")
	 public String createCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		 if (result.hasErrors()) {
	         return "NewCategory.jsp";
	     } else {
	         appService.createCategory(category);
	         return "redirect:/";
	     }
	 }
	 
	 @GetMapping("/products/{id}")
	 public String oneProduct(@PathVariable("id") Long id, Model model) {
		 Product product = appService.findProduct(id);
		 model.addAttribute("product", product);
		 model.addAttribute("categories", appService.productsNotInCategories(product));
		 return "OneProduct.jsp";
	 }
	 
	 @PostMapping("/add/category")
	 public String addCategory(@RequestParam("product") Long idProduct, @RequestParam("category") Long idCategory) {
		 Product product = appService.findProduct(idProduct);
		 Category category = appService.findCategory(idCategory);
		 List <Category> productCategory = product.getCategories();
		 productCategory.add(category);
		 product.setCategories(productCategory);
		 appService.updateProduct(product);
		 
		 return "redirect:/";
	 }
	 
	 @GetMapping("/categories/{id}")
	 public String oneCategory(@PathVariable("id") Long id, Model model) {
		 Category category = appService.findCategory(id);
		 model.addAttribute("category", category);
		 model.addAttribute("products", appService.categoriesNotInProducts(category));
		 return "OneCategory.jsp";
	 }
//	 
//	 @PostMapping("/add/product")
//	 public String addProduct(@RequestParam("product") Long idProduct, @RequestParam("category") Long idCategory) {
//		 Product product = appService.findProduct(idProduct);
//		 Category category = appService.findCategory(idCategory);
//		 List <Product> categoryProduct = category.getProducts();
//		 categoryProduct.add(product);
//		 category.setProducts(categoryProduct);
//		 appService.updateCategory(category);
//		 
//		 return "redirect:/";
//	 }
}

