package com.algoDomain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algoDomain.entity.Product;
import com.algoDomain.repo.ProductRepo;

@Service
public class ProductImpl implements ProductInterface {

	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}

	@Override
	public List<Product> getListProduct(String productName) {
		
		List<Product> list = productRepo.findByProductName(productName);
		
		return list;
	}

	@Override
	public List<Product> getListProductType(String productType) {

		List<Product> list = productRepo.findByProductType(productType);
		
		return list;

	}

	@Override
	public List<Product> getListProductCategory(String productCategory) {
		
		List<Product> list = productRepo.getProductListByCategory(productCategory);
		
		return list;
	}

	@Override
	public List<Product> getListProductPrice(Integer min, Integer max) {

		List<Product> list = productRepo.getProductListByPrice(min, max);
		
		return list;
	}

}
