package org.com.services;

import java.util.List;
import java.util.Optional;

import org.com.dao.AccountRepository;
import org.com.dao.TransactionRepository;
import org.com.dao.UserRepository;
import org.com.model.WalletAccount;
import org.com.model.WalletTransaction;
import org.com.model.WalletUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

	@Autowired
	TransactionRepository tdao;

	@Autowired
	UserRepository udao;

	@Autowired
	AccountRepository adao;

	public boolean addTransaction(WalletTransaction wt) {
		Optional<WalletTransaction> find = tdao.findById(wt.getTransactionId());
		if (!find.isPresent()) {
			tdao.save(wt);
			return true;
		} else
			return false;
	}
	
	public boolean updateBalanceAtRecieverEnd(WalletTransaction wt) {
		Optional<WalletAccount> account = adao.findById(wt.getReceiverId());
		 if(account.isPresent()) {
			 WalletAccount wa = account.get();
			 wa.setAccountBalance(wa.getAccountBalance()+wt.getAmount());
			 adao.save(wa);
			 return true;
		 }else
		return false;
	}
	
	public boolean updateBalanceAtSenderEnd(WalletTransaction wt) {
		Optional<WalletAccount> account = adao.findById(wt.getSenderId());
		 if(account.isPresent()) {
			 WalletAccount wa = account.get();
			 wa.setAccountBalance(wa.getAccountBalance()-wt.getAmount());
			 adao.save(wa);
			 return true;
		 }else
		return false;
	}
	
	public List<WalletTransaction> showAllTransactions(){
		return tdao.findAll();
	}
	
	public List<WalletUser> SerachByname(String name){
		name = name.toLowerCase();
		return udao.findByName(name);
	}
	
	public double getBalance(int id) {
		Optional<WalletUser> user = udao.findById(id);
		return user.get().getWalletAccount().getAccountBalance();
	}
	
	
}
