package com.app.service;

import com.app.pojos.Account;

public interface IAccountService {
	Account createAccount(Account a);
	Account getAccount(int acctId,int brId);
	Account updateAccount(Account a);
}
