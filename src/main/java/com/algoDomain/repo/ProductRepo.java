package com.algoDomain.repo;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.algoDomain.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	// Search by Product name
   public List<Product>  findByProductName(String productName);
	
	// Search by Product Type
   public List<Product> findByProductType(String productType);
	
	// Search by Product Category
	@Query("select p from Product p where p.productCategory =:cate")
	public List<Product> getProductListByCategory(@Param("cate") String productCategory);
	
	// Search by Product price range
	@Query("select p from Product p where p.productPrice BETWEEN :min AND :max ORDER BY p.productPrice")
	public List<Product> getProductListByPrice(@Param("min") Integer minPrice, @Param("max") Integer maxPrice);
	
}
