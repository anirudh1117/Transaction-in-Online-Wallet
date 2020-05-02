package org.com.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.HashMap;
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
	
	public List<String> SerachByname(String name){
		name = name.toLowerCase();
		List<String> namelist = new ArrayList<>();
		//HashMap<Integer,String> hash = new HashMap<>();
		List<WalletUser> list = udao.findByName(name);
		for(WalletUser user:list) {
			String str = user.getUserName()+" (" +user.getWalletAccount().getAccountId()+")";
			//hash.put(user.getWalletAccount().getAccountId(), user.getUserName());
			namelist.add(str);
		}
		return namelist;
	}
	
	public double getBalance(int id) {
		Optional<WalletUser> user = udao.findById(id);
		return user.get().getWalletAccount().getAccountBalance();
	}
	
	
}
