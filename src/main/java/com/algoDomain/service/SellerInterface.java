package com.algoDomain.service;

import java.util.List;

import com.algoDomain.entity.Product;
import com.algoDomain.entity.Seller;
import com.algoDomain.usecase.SellerUse;


public interface SellerInterface {
	
	Seller saveSeller(SellerUse seller);
	
	List<Product> getProducts(Integer sellerId);

	Product updateProduct(Product product, Integer proId);
	
	String deleteProduct(Integer proId);
}
