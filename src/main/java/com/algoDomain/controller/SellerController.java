package com.algoDomain.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.algoDomain.entity.Product;
import com.algoDomain.entity.Seller;
import com.algoDomain.service.SellerServiceImpl;
import com.algoDomain.usecase.SellerUse;

@RestController
public class SellerController {

	@Autowired
	private SellerServiceImpl si;
	
	@PostMapping("/algodomain/seller")
	public ResponseEntity<Seller> saveSeller(@RequestBody SellerUse input){
		
		Seller so = si.saveSeller(input);
		
		return new ResponseEntity<Seller>(so, HttpStatus.ACCEPTED); 
	}
	
	@GetMapping("/algodomain/seller/{sellerId}")
	public ResponseEntity<List<Product>> getListProduct(@PathVariable("sellerId") Integer sellerId){
		
		List<Product> listProduct = si.getProducts(sellerId);
		
		return new ResponseEntity<List<Product>>(listProduct, HttpStatus.OK);
	}
	
	
	@PutMapping("/algodomain/seller/{productId}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product prodct, @PathVariable("productId") Integer pid){
		
		Product upProd = si.updateProduct(prodct, pid);
		
		return new ResponseEntity<Product>(upProd, HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/algodomain/seller/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable("productId") Integer pid){
		
		String upProd = si.deleteProduct(pid);
		
		return new ResponseEntity<String>(upProd, HttpStatus.ACCEPTED);
	}
	
}
