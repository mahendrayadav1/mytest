package com.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository repository;
	
	public void createAndUpdateAcctDetails(Account account) {
		repository.save(account);
	}
	
	public List<Account> getAllAccounts () {
		return repository.findAll();
	}

}
