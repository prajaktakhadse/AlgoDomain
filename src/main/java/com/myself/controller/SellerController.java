package com.myself.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myself.model.Product;
import com.myself.model.Seller;
import com.myself.service.SellerServiceImpl;

@RestController
public class SellerController {

	@Autowired
	private SellerServiceImpl si;
	
	@PostMapping("/alsodomain/seller")
	public ResponseEntity<Seller> saveSeller(@RequestBody Seller input){
		
		Seller so = si.saveSeller(input);
		
		return new ResponseEntity<Seller>(so, HttpStatus.ACCEPTED); 
	}
	
	@GetMapping("/alsodomain/seller/{sellerId}")
	public ResponseEntity<List<Product>> getListProduct(@PathVariable("sellerId") Integer sellerId){
		
		List<Product> listProduct = si.getProducts(sellerId);
		
		return new ResponseEntity<List<Product>>(listProduct, HttpStatus.OK);
	}
	
	

}
