package com.epam.cdp.mbank.service.admin;

import java.util.List;

import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;

public interface AdminActionInterface {

	public void addNewClient(Client client);

	public void updateClientDetails(Client client);

	public void removeClient(Long clientId);

	public Client getClientById(Long clientId);

	public List<Client> getClientsByName(String clientName);

	public List<Client> getClientsByEmail(String clientEmail);

	public List<Client> getClientsByPhone(String clientPhone);

	public List<Client> getClientsByAdress(String clientAdress);

	public List<Client> getAllClients();

	public Account getClientAccount(Long clientId);

	public List<Account> getAllAccounts();

	public List<Deposit> getClientDeposites(Long clientId);

	public List<Deposit> getAllDeposites();

	public List<Activity> getClientActivities(Long clientId);

	public List<Activity> getAllActivities();
	
	public void updateSystemPropety(Property property);
	
	public Property getSystemPropertyValueByKey(String key);
	
	public List<Property> getAllSystemProperty();

}
