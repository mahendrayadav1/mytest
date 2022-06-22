package com.account;
import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	private AccountService service;
	
	@PostMapping("/accounts")
	public void createAccount(@RequestBody Account account) {
		service.createAndUpdateAcctDetails(account);
	}
	
	@GetMapping("/accounts")
	public List<Account> getAllAccounts () {
		return service.getAllAccounts();
	}

}
