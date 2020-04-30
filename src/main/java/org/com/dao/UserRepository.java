package org.com.dao;


import java.util.List;

import org.com.model.WalletUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<WalletUser, Integer> {
	
	@Query("SELECT w FROM WalletUser w WHERE LOWER(w.UserName) LIKE %?1%")
	  public List<WalletUser> findByName(String name);
}
