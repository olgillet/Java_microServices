package com.mysite.cartservice.model;

import java.util.List;

public class ProductList {
	List<Product> productList;

	public ProductList(List<Product> productList) {
		super();
		this.productList = productList;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public ProductList() {
		super();
	}
	
	
}
