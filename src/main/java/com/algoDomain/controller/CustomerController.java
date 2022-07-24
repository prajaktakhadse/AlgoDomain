package com.algoDomain.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.algoDomain.entity.Product;
import com.algoDomain.service.ProductImpl;


@RestController
public class CustomerController {
	
	@Autowired
	private ProductImpl pi;

	//Search and get list for products based on: product name
	@GetMapping("/algodomain/search/name/{productName}")
	public ResponseEntity<List<Product>> searchByName(@PathVariable("productName") String productname){
		
		List<Product> list = pi.getListProduct(productname);
		
		return new ResponseEntity<List<Product>>(list, HttpStatus.ACCEPTED);
	}
	
	//Search and get list for products based on: product Type
	@GetMapping("/algodomain/search/type/{productType}")
	public ResponseEntity<List<Product>> searchByType(@PathVariable("productType") String producttype){
			
		List<Product> list = pi.getListProductType(producttype);
			
		return new ResponseEntity<List<Product>>(list, HttpStatus.ACCEPTED);
	}
	
	//Search and get list for products based on: product category
	@GetMapping("/algodomain/search/category/{productCategory}")
	public ResponseEntity<List<Product>> searchByCategory(@PathVariable("productCategory") String productcategory){
				
		List<Product> list = pi.getListProductCategory(productcategory);
				
		return new ResponseEntity<List<Product>>(list, HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/algodomain/search/price/{minPrice}/{maxPrice}")
	public ResponseEntity<List<Product>> searchByPrice(@PathVariable("minPrice") Integer min, @PathVariable("maxPrice") Integer max){
				
		List<Product> list = pi.getListProductPrice(min, max);
				
		return new ResponseEntity<List<Product>>(list, HttpStatus.ACCEPTED);
	}
	
}
