package com.myself.service;

import java.util.List;

import com.myself.model.Product;
import com.myself.model.Seller;


public interface SellerInterface {
	
	Seller saveSeller(Seller seller );
	
	List<Product> getProducts(Integer sellerId);
	
	Product deleteProduct(Integer sellerId, Integer productId);

}
