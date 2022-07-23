package com.myself.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myself.model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>{

}