package com.myself.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myself.model.Seller;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {

	
	
}
