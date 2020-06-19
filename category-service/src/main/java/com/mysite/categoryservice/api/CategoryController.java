package com.mysite.categoryservice.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mysite.categoryservice.model.Category;

@RestController
public class CategoryController {
	
	List<Category> categoryList = new ArrayList<Category>();
	
	public CategoryController() {
		super();
		Category c1 = new Category(1, "c1");
		Category c2 = new Category(2, "c2");
		Category c3 = new Category(3, "c3");
		this.categoryList.add(c1);
		this.categoryList.add(c2);
		this.categoryList.add(c3);
	}
	
	@GetMapping("/categories")
	public List<Category> getAll() {
		return categoryList;
	}
	
	@GetMapping("/categories/{id}")
	public Category getOne(@PathVariable("id") int id) {
		System.out.println("----- Category - get category by id : " + id);
		Category result = (Category)categoryList.get(id);
		return result;
	}
}
