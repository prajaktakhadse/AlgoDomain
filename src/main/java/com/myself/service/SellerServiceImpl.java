package com.myself.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myself.model.Product;
import com.myself.model.Seller;

import com.myself.repo.SellerRepo;

@Service
public class SellerServiceImpl implements SellerInterface {
	
	@Autowired
	private SellerRepo sr;
	
	@Override
	public Seller saveSeller(Seller seller) {
		
		return sr.save(seller)	;
	}

	@Override
	public List<Product> getProducts(Integer sellerId) {
		
		 Optional<Seller> sell =  sr.findById(sellerId);	
		
		 if(sell.isPresent()) {
			 
			 Seller main = sell.get();
			 
			 return main.getProd_list();
		 }
		
		 else {
			 return null;
		 }
		
	}

	@Override
	public Product deleteProduct(Integer sellerId, Integer productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
