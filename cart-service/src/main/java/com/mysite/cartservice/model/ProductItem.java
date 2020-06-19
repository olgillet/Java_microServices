package com.mysite.cartservice.model;


public class ProductItem {
	int id;
	String name;
	String categoryName;


	public ProductItem(int id, String name, String categoryName) {
		super();
		this.id = id;
		this.name = name;
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public ProductItem(int id, String name) {
		super();
		this.name = name;
		
	}

	public ProductItem() {
		super();
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
		return "ProductItem [id=" + id + ", name=" + name + "]";
	}

}
