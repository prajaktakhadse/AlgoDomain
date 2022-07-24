package com.algoDomain.service;

import java.util.List;

import com.algoDomain.entity.Product;

public interface ProductInterface {
	Product saveProduct(Product product);
	
	List<Product> getListProduct(String name);
	
	List<Product> getListProductType(String type);
	
	List<Product> getListProductCategory(String productCategory);
	
	List<Product> getListProductPrice(Integer min, Integer max);
}
