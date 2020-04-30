package org.com.dao;


import org.com.model.WalletTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<WalletTransaction, Integer> {
	
	
	

}
