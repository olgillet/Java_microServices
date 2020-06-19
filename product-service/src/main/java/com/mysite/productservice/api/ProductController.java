package com.mysite.productservice.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mysite.productservice.model.Product;
import com.mysite.productservice.model.ProductList;


@RestController
public class ProductController {
	
	ProductList productList = new ProductList();
	
	public ProductController() {
		super();
		
		Product p1 = new Product(1, "p1", 1);
		Product p2 = new Product(2, "p2", 2);
		Product p3 = new Product(3, "p3", 2);
		
		this.productList.add(p1);
		this.productList.add(p2);
		this.productList.add(p3);
	}

	@GetMapping("/products")
	public ProductList getAll() {
		return this.productList;
	}
	
	@GetMapping("/products/{id}")
	public Product getOne(@PathVariable("id") int id) {
		System.out.println("----- Product - get product by id : " + id);
		return this.productList.getProductList().get(id); 
	}
}
