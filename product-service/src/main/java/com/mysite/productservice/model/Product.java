package com.mysite.productservice.model;


public class Product {
	int id;
	String name;
	int categoryId;

	public Product(int id, String name, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Product() {
		super();
	}

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + "]";
	}

}
