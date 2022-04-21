package com.thbs.Banking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.thbs.Banking.entity.Customer;
import com.thbs.Banking.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	public Customer update(Customer customer) {
		return customerRepository.save(customer);
	}

	public void delete(@PathVariable Long id) {
		customerRepository.deleteById(id);
	}

	public Optional<Customer> getOne(@PathVariable Long id) {
		return customerRepository.findById(id);
	}

	public List<Customer> getAll() {
		return customerRepository.findAll();
	}

}