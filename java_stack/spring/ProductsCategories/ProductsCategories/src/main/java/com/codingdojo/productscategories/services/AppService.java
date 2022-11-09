package com.codingdojo.productscategories.services;

import java.util.List;

//...
import org.springframework.stereotype.Service;

import com.codingdojo.productscategories.models.Category;
import com.codingdojo.productscategories.models.Product;
import com.codingdojo.productscategories.repositories.CategoryRepository;
import com.codingdojo.productscategories.repositories.ProductRepository;

@Service
public class AppService {
 // adding the book repository as a dependency
 private final ProductRepository productRepository;
 private final CategoryRepository categoryRepository;
 
 public AppService(ProductRepository productRepository, CategoryRepository categoryRepository) {
     this.productRepository = productRepository;
     this.categoryRepository = categoryRepository;
 }
 
 public List<Product> allProducts() {
     return productRepository.findAll();
 }
 
public List<Category> allCategories() {
   return categoryRepository.findAll();
}
   
 public Product createProduct(Product p) {
     return productRepository.save(p);
 }
 
 public Category createCategory(Category c) {
     return categoryRepository.save(c);
 }
 
 public Product findProduct(Long id) {
	 return this.productRepository.findById(id).orElse(null);
 }
 
 public Category findCategory(Long id) {
	 return this.categoryRepository.findById(id).orElse(null);
 }
 
 public void updateProduct(Product p) {
	 productRepository.save(p);
 }
 
 public void updateCategory(Category c) {
	 categoryRepository.save(c);
 }
 
 public List<Category> productsNotInCategories(Product p) {
	 return this.categoryRepository.findByProductsNotContains(p);
	 
 }
 
 public List<Product> categoriesNotInProducts(Category c) {
	 return this.productRepository.findByCategoriesNotContains(c);
	 
 }

}
