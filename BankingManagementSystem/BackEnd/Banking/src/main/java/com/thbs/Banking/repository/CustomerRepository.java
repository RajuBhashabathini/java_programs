package com.thbs.Banking.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thbs.Banking.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	Optional<Customer> findByEmailAndPassword(String email, String password);
	
	Customer findByAccountNo(String accountNum);

	//boolean existsByAccountNum(String accountNum);

	boolean existsByAccountNo(String accountNum);
}
