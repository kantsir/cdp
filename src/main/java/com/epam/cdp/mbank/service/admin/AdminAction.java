package com.epam.cdp.mbank.service.admin;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;

@WebService(name = "AdminActionPort", targetNamespace = "http://cdp.epam.com/ws/admin")
public interface AdminAction {

	@WebMethod
	public void addNewClient(@WebParam(name = "client") Client client);

	@WebMethod
	public void updateClientDetails(@WebParam(name = "client") Client client);

	@WebMethod
	public void removeClient(@WebParam(name = "clientId") Long clientId);

	@WebMethod
	public Client getClientById(@WebParam(name = "clientId") Long clientId);

	@WebMethod
	public List<Client> getClientsByName(@WebParam(name = "clientName") String clientName);

	@WebMethod
	public List<Client> getClientsByEmail(@WebParam(name = "clientEmail") String clientEmail);

	@WebMethod
	public List<Client> getClientsByPhone(@WebParam(name = "clientPhone") String clientPhone);

	@WebMethod
	public List<Client> getClientsByAdress(@WebParam(name = "clientAddress") String clientAddress);

	@WebMethod
	public List<Client> getAllClients();

	@WebMethod
	public Account getClientAccount(@WebParam(name = "clientId") Long clientId);

	@WebMethod
	public List<Account> getAllAccounts();

	@WebMethod
	public List<Deposit> getClientDeposites(@WebParam(name = "clientId") Long clientId);

	@WebMethod
	public List<Deposit> getAllDeposites();

	@WebMethod
	public List<Activity> getClientActivities(@WebParam(name = "clientId") Long clientId);

	@WebMethod
	public List<Activity> getAllActivities();

	@WebMethod
	public void updateSystemPropety(@WebParam(name = "property") Property property);

	@WebMethod
	public Property getSystemPropertyValueByKey(@WebParam(name = "key") String key);

	@WebMethod
	public List<Property> getAllSystemProperty();

}
