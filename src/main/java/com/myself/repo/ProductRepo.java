package com.myself.repo;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myself.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
//	@Query("select u from product u")
//    public List<Product> findBySellerId();

	
}
