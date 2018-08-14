package com.qa.boot.AccountManagmentApplication;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
public class AccountController {
	@Autowired
	private AccountRepository accountRepository;
		
	@RequestMapping("/accounts")
	@ResponseBody
	public Collection<Account> accounts(){
		return accountRepository.findAll().stream()
				.collect(Collectors.toList());
		}
	
	private boolean Decision(Account account) {
		return account.getFirstName().equals("Paul") &&
				account.getFirstName().equals("Saad") &&
				account.getFirstName().equals("Alex") &&
				account.getFirstName().equals("Herbert");
		}
	

	@RequestMapping("/add-accounts")
	@ResponseBody
	public void addAccount(@RequestBody String accounts) {
		Account[] accountArray = new Gson().fromJson(accounts, Account[].class);
		Arrays.asList(accountArray).forEach(account -> accountRepository.save((Account) account));
	}
}