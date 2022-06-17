package com.thbs.Banking.service;

//import java.sql.Date;
import java.time.LocalDate;
//import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thbs.Banking.entity.Customer;
import com.thbs.Banking.entity.Transaction;
import com.thbs.Banking.entity.TransactionsBWDates;
import com.thbs.Banking.repository.CustomerRepository;
import com.thbs.Banking.repository.TransactionRepository;

@Service
public class TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	@Autowired
	private CustomerRepository customerRepository;

	public boolean deposite(Transaction transaction) {

		String accountNum = transaction.getAccountNum();
		Customer customer = customerRepository.findByAccountNo(accountNum);
        boolean accno = customerRepository.existsByAccountNo(accountNum);
		if (accno) {

			double balance = customer.getBalance();
			balance = balance + transaction.getAmount();
			customer.setBalance(balance);
			customerRepository.save(customer);

			String date = LocalDate.now().toString();
			transaction.setDate(date);

			transactionRepository.save(transaction);
			return true;

		}

		return false;
	}

	public List<Transaction> getAll(String accountNum) {
		return transactionRepository.findAllByAccountNum(accountNum);
	}

	public boolean withdraw(Transaction transaction) {
		String accountNum = transaction.getAccountNum();
		double amount= transaction.getAmount();
		Customer customer = customerRepository.findByAccountNo(accountNum);

		if (customer != null) {

			double balance = customer.getBalance();
			if(balance<amount)
			{
				return false;
			}
			else
			{
			balance = balance - transaction.getAmount();
			customer.setBalance(balance);
			customerRepository.save(customer);

			String date = LocalDate.now().toString();
			transaction.setDate(date);

			transactionRepository.save(transaction);
			return true;
			}

		}

		return false;
	}
	
	public boolean fundTransfer(List<Transaction> transactions) {

		for (Transaction transaction : transactions) {

			
			if (transaction.getType().equals("CREDIT")) {

				  deposite(transaction);
				}
			if (transaction.getType().equals("DEBIT")) {
				 withdraw(transaction);
			}

		}
		return true;
	}

	public List<Transaction> getTransactions(TransactionsBWDates tbwd) {
		// TODO Auto-generated method stub
		return transactionRepository.findAllByDateLessThanEqualAndDateGreaterThanEqualAndAccountNum( tbwd.getEndDate(),tbwd.getStartDate(),tbwd.getAccountNum());
	}
}
