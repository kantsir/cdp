package com.epam.cdp.mbank;

import com.epam.cdp.mbank.core.db.dao.AccountDao;
import com.epam.cdp.mbank.core.db.dao.ClientDao;
import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.enums.ClientType;

public class App {

    public static void main(String[] args) {
	System.out.println("Hello World!");

	// Client client = new Client();
	// client.setClient_name("Roman");
	// client.setComment("TEST Comments");
	// client.setEmail("kantsir.roman@gmail.com");
	// client.setType(ClientType.PLATINUM);
	//
	// ClientDao cd = new ClientDao(Client.class);
	// cd.save(client);
	//
	// Account account = new Account();
	// account.setBalance(15.25);
	// account.setComment("edddsdsdsddddsddsdd");
	// account.setCreditLimit(12.2);
	// account.setClient(client);
	//
	// AccountDao ad = new AccountDao(Account.class);
	// ad.save(account);
	//
	// Client client2 = new Client();
	// client2.setClient_name("Roman2");
	// client2.setComment("TEST Comments2");
	// client2.setEmail("2kantsir.roman@gmail.com");
	// client2.setType(ClientType.REGULAR);
	//
	// ClientDao cd2 = new ClientDao(Client.class);
	// cd2.save(client2);
	//
	// Account account2 = new Account();
	// account2.setBalance(195.25);
	// account2.setComment("edddssddsdd");
	// account2.setCreditLimit(132.2);
	// account2.setClient(client2);
	//
	// AccountDao ad2 = new AccountDao(Account.class);
	// ad2.save(account2);
	//
	// Deposit dep = new Deposit();
	// dep.setBalance(21356.3);
	// Calendar date = Calendar.getInstance(Locale.US);
	// //date.set(1989, 8, 12);
	// dep.setClosingDate(date);
	// dep.setClient(client2);
	// dep.setType(DepositType.LONG);
	// DepositDao dd = new DepositDao(Deposit.class);
	// dd.save(dep);
	//
	// Deposit dep2 = new Deposit();
	// dep.setBalance(1356.3);
	// Calendar date2 = Calendar.getInstance(Locale.US);
	// //date.set(1989, 8, 12);
	// dep2.setClosingDate(date2);
	// dep2.setClient(client);
	// dep2.setType(DepositType.LONG);

	Client client = new Client();
	client.setClientName("GRAND TEST2");
	client.setEmail("TEST2@epam.com");
	client.setPassword("pass2");
	client.setComment("commmments2");
	client.setType(ClientType.GOLD);

	Account account = new Account();
	account.setBalance(1541.2);
	account.setCreditLimit(1555.25);
	account.setComment("acxvcvcvxv");

	client.setAccount(account);

	ClientDao cd = new ClientDao();
	cd.save(client);
	
	
  
        
        

    }
}
