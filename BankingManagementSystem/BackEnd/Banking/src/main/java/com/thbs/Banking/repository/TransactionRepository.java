package com.thbs.Banking.repository;

//import java.sql.Date;
//import java.time.OffsetDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thbs.Banking.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findAllByAccountNum(String accountNum);

	//List<Transaction> findAllByStartDateLessThanEqualAndEndDateGreaterThanEqual(Date endDate, Date startDate);

	List<Transaction> findAllByDateLessThanEqualAndDateGreaterThanEqualAndAccountNum(String endDate, String startDate, String accountNum);

	 //boolean existsByAccountNum(String accountNum);
}
