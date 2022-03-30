package com.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Account;
import com.app.pojos.AccountPK;

@SpringBootTest
class ServiceLayerTests {
	@Autowired
	private IAccountService service;

	@Test
	void testCreateAccount() {
		Account account=new Account("Raj", "Saving", 10000);
		AccountPK acctoutPK=new AccountPK(1001, 10);
		account.setId(acctoutPK);
		Account account2 = service.createAccount(account);	
		assertNotNull(account2.getId());
	}
	@Test
	void testGetAccount()
	{
		Account account = service.getAccount(1001, 10);
		assertEquals(10000, account.getBal());
	}

}
