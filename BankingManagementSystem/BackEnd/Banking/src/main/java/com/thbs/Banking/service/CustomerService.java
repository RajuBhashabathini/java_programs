package com.thbs.Banking.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.thbs.Banking.entity.Customer;
import com.thbs.Banking.entity.Login;
import com.thbs.Banking.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Customer save(Customer customer) {
		
		Random random = new Random();
		String accountNumber = String.valueOf(random.nextInt(10000000));
		customer.setAccountNo(accountNumber);

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
	public Optional<Customer> authenticate(Login login) {

		return customerRepository.findByEmailAndPassword(login.getEmail(), login.getPassword());
	}
	public Customer getProfile(String accountNum) {

		return customerRepository.findByAccountNo(accountNum);
	}
}
