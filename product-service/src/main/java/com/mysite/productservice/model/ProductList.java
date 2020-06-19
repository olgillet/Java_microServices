package com.mysite.productservice.model;

import java.util.ArrayList;
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
	
	public void add(Product product) {
		this.productList.add(product);
	}

	public ProductList() {
		super();
		this.productList = new ArrayList<Product>();
	}

	
}
