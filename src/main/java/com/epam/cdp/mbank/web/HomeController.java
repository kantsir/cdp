package com.epam.cdp.mbank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.cdp.mbank.service.admin.AdminAction;
import com.epam.cdp.mbank.service.admin.AdminActionImpl;


@Controller
public class HomeController {
 
	@Autowired
	public AdminAction adm; 
	
    @RequestMapping(value = "/home.htm")
    public String home() {
        System.out.println("HomeController: Passing through...");
        return "redirect:http://www.google.com.ua";
    }
    
    
    @RequestMapping(value = "/clients.htm")
    public String clients(){
    	System.out.println("clients");
    	System.out.println(adm.getAllClients().size());
		return "redirect:http://www.google.com.ua";
    }
}

