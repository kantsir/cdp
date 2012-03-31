package com.epam.cdp.mbank.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;
import com.epam.cdp.mbank.service.admin.AdminService;

@WebService
public class WSAdminAction {

	@Autowired
	AdminService adminService;

	@WebMethod
	public void addNewClient(@WebParam(name = "client") Client client) {
		adminService.addNewClient(client);
	}

	@WebMethod
	public void updateClientDetails(@WebParam(name = "client") Client client) {
		adminService.updateClientDetails(client);
	}

	@WebMethod
	public void removeClient(@WebParam(name = "clientId") Long clientId) {
		adminService.removeClient(clientId);
	}

	@WebMethod
	public Client getClientById(@WebParam(name = "clientId") Long clientId) {
		return adminService.getClientById(clientId);

	}

	@WebMethod
	public List<Client> getClientsByName(
			@WebParam(name = "clientName") String clientName) {
		return adminService.getClientsByName(clientName);
	}

	@WebMethod
	public List<Client> getClientsByEmail(
			@WebParam(name = "clientEmail") String clientEmail) {
		return adminService.getClientsByEmail(clientEmail);
	}

	@WebMethod
	public List<Client> getClientsByPhone(
			@WebParam(name = "clientPhone") String clientPhone) {
		return adminService.getClientsByPhone(clientPhone);
	}

	@WebMethod
	public List<Client> getClientsByAdress(
			@WebParam(name = "clientAddress") String clientAddress) {
		return null;
	}

	@WebMethod
	public List<Client> getAllClients() {
		return adminService.getAllClients();
	}

	@WebMethod
	public Account getClientAccount(@WebParam(name = "clientId") Long clientId) {
		return adminService.getClientAccount(clientId);
	}

	@WebMethod
	public List<Account> getAllAccounts() {
		return adminService.getAllAccounts();
	}

	@WebMethod
	public List<Deposit> getClientDeposites(
			@WebParam(name = "clientId") Long clientId) {
		return adminService.getClientDeposites(clientId);
	}

	@WebMethod
	public List<Deposit> getAllDeposites() {
		return adminService.getAllDeposites();
	}

	@WebMethod
	public List<Activity> getClientActivities(
			@WebParam(name = "clientId") Long clientId) {
		return adminService.getClientActivities(clientId);
	}

	@WebMethod
	public List<Activity> getAllActivities() {
		return adminService.getAllActivities();
	}

	@WebMethod
	public void updateSystemPropety(
			@WebParam(name = "property") Property property) {
		adminService.updateSystemPropety(property);
	}

	@WebMethod
	public Property getSystemPropertyValueByKey(
			@WebParam(name = "key") String key) {
		return adminService.getSystemPropertyValueByKey(key);
	}

	@WebMethod
	public List<Property> getAllSystemProperty() {
		return adminService.getAllSystemProperty();
	}
}