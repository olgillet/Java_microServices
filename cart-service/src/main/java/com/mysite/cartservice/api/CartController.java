package com.mysite.cartservice.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mysite.cartservice.model.Category;
import com.mysite.cartservice.model.Product;
import com.mysite.cartservice.model.ProductItem;
import com.mysite.cartservice.model.ProductList;

@RestController
public class CartController {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@GetMapping("/carts/{id}")
	public List<ProductItem> getAll(@PathVariable("id") int id) {
		System.out.println("----- Cart - get cart by id : " + id);
		List<ProductItem> productItemList = new ArrayList<>();
		
		//restTemplate.getForObject("http://localhost:8082/myapp/productservice/products", ProductList.class).getProductList().stream()
		for(Product product : restTemplate.getForObject("http://localhost:8082/myapp/productservice/products", ProductList.class).getProductList()) {
			ProductItem productItem = new ProductItem();
			productItem.setId(product.getCategoryId());
			productItem.setName(product.getName());
			productItem.setCategoryName( restTemplate.getForObject("http://localhost:8081/myapp/categoryservice/categories/"+product.getCategoryId(), Category.class).getName() );
			productItemList.add(productItem);
		}
		return productItemList;
	}
}
