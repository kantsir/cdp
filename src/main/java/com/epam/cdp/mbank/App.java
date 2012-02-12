package com.epam.cdp.mbank;

import com.epam.cdp.mbank.service.admin.AdminActionImpl;

public class App {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		AdminActionImpl act = new AdminActionImpl();
        
		System.out.println(act.getAllClients().size());
	
	}
}
