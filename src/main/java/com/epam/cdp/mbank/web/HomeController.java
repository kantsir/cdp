package com.epam.cdp.mbank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.epam.cdp.mbank.service.admin.AdminService;


@Controller
public class HomeController {
 
	@Autowired
	public AdminService adminService; 
	
    @RequestMapping(value = "/home.htm")
    public String home() {
        System.out.println("HomeController: Passing through...");
        return "redirect:http://www.google.com.ua";
    }
    
    
    @RequestMapping(value = "/clients.htm")
    public String clients(){
    	System.out.println("clients");
    	System.out.println(adminService.getAllClients().size());
    	Double bal= adminService.getAllClients().get(4).getAccount().getBalance();
    	System.out.println(adminService.getAllClients().get(4).getAccount().getBalance());
		return "redirect:http://www.google.com.ua"+"/q="+bal.toString();
    }
    
    @RequestMapping(value = "/act")
    public String activity(){
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	System.out.println("!!!!!!!!!!activity!!!!!!!!");
    	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!");
    	
    	System.out.println(adminService.getClientActivities(new Long(54)).get(0).getAmount());
    	
		return "redirect:http://www.google.com.ua"+"/activityamount="+adminService.getClientActivities(new Long(54)).get(0).getAmount();
    }
}

