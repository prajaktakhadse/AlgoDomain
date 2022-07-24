package com.algoDomain.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.algoDomain.entity.Product;
import com.algoDomain.entity.Seller;
import com.algoDomain.exception.SellerNotFound;
import com.algoDomain.repo.ProductRepo;
import com.algoDomain.repo.SellerRepo;
import com.algoDomain.usecase.SellerUse;

@Service
public class SellerServiceImpl implements SellerInterface {
	
	@Autowired
	private SellerRepo sellerrepo;
	
	@Autowired
	private ProductRepo productrepo;
	
	@Override
	public Seller saveSeller( SellerUse seller) {
		
		return sellerrepo.save(seller.getSeller())	;
	}

	@Override
	public List<Product> getProducts(Integer sellerId) {
		
		List<Product> list =  productrepo.findAll();
		
		return list;
	}

	@Override
	public Product updateProduct(Product product, Integer productId) {

		Optional<Product> pro = productrepo.findById(productId);
		
		if(pro.isPresent()){
			
			return productrepo.save(product);
			
		}
		else {
			throw new SellerNotFound("Product not found..!!");
		}
		
	}

	@Override
	public String deleteProduct(Integer productId) {
		
		Optional<Product> prod = productrepo.findById(productId);
		
		if(prod.isPresent()){
			
			Product deletePro = prod.get(); 
			productrepo.delete(deletePro);
			
			return "Successfully Deleted";
			
		}
		else {
			return "Please enter correct ProductId";
		}
		
		
	}

}
