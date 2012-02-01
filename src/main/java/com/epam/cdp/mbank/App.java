package com.epam.cdp.mbank;

import com.epam.cdp.mbank.core.db.dao.ClientDao;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.enums.ClientActiveState;
import com.epam.cdp.mbank.model.enums.ClientType;

public class App {

    public static void main(String[] args) {
	System.out.println("Hello World!");

	 Client client = new Client();
	 client.setClientName("Roman");
	 client.setComment("TEST Comments");
	 client.setEmail("kantsir.roman@gmail.com");
	 client.setType(ClientType.PLATINUM);
	 client.setClientActiveState(ClientActiveState.ACTIVE);
	 
	 ClientDao cd = new ClientDao();
	 cd.save(client);
	
	
	
	
  
        
        

    }
}
