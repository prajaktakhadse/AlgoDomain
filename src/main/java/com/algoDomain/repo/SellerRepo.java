package com.algoDomain.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.algoDomain.entity.Seller;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Integer> {

}
