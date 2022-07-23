package com.myself.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myself.model.Product;
import com.myself.repo.ProductRepo;

@Service
public class ProductImpl implements ProductInterface {

	@Autowired
	private ProductRepo pr;
	
	@Override
	public Product saveProduct(Product product) {
		return pr.save(product);
	}

}
