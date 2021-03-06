package org.com.dao;


import org.com.model.WalletAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<WalletAccount, Integer> {
	
}
