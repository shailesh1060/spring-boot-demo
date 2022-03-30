package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AccountRepository;
import com.app.pojos.Account;
import com.app.pojos.AccountPK;

@Service
@Transactional
public class AccountServiceImpl implements IAccountService {
	@Autowired
	private AccountRepository accountRepo;

	@Override
	public Account createAccount(Account a) {
		// TODO Auto-generated method stub
		return accountRepo.save(a);
	}

	@Override
	public Account getAccount(int acctId, int branchId) {
		// TODO Auto-generated method stub
		return accountRepo.findById(new AccountPK(acctId, branchId))
				.orElseThrow(() -> new RuntimeException("Account not found!!!"));
	}

	@Override

	public Account updateAccount(Account a) {
		// TODO Auto-generated method stub
		return accountRepo.save(a);
	}

}
