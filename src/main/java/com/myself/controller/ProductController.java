package com.myself.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myself.model.Product;
import com.myself.service.ProductInterface;

@RestController
public class ProductController {

	@Autowired
	private ProductInterface pi;
	
	@PostMapping("/alsodomain/product")
	public ResponseEntity<Product> saveSeller(@RequestBody Product p){
		
		Product po = pi.saveProduct(p);
		
		return new ResponseEntity<Product>(po, HttpStatus.ACCEPTED); 
	}
	
	
}
