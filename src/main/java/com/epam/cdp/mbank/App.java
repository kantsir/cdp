package com.epam.cdp.mbank;

import com.epam.cdp.mbank.service.admin.AdminAction;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		AdminAction act = new AdminAction();
        
		System.out.println(act.getAllClients().size());
	
	}
}
