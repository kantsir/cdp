package com.epam.cdp.mbank.service.admin;

import java.util.List;

import com.epam.cdp.mbank.core.db.daoImplementation.AccountDao;
import com.epam.cdp.mbank.core.db.daoImplementation.ActivityDao;
import com.epam.cdp.mbank.core.db.daoImplementation.ClientDao;
import com.epam.cdp.mbank.core.db.daoImplementation.DepositDao;
import com.epam.cdp.mbank.core.db.daoImplementation.PropertyDao;
import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;
import com.epam.cdp.mbank.model.enums.ClientActiveState;

public class AdminAction implements AdminActionInterface {

	private ClientDao clientDao = new ClientDao();
	private AccountDao accountDao = new AccountDao();
	private ActivityDao activityDao = new ActivityDao();
	private DepositDao depositDao = new DepositDao();
	private PropertyDao propertyDao = new PropertyDao();

	public void addNewClient(Client client) {
		client.setClientActiveState(ClientActiveState.ACTIVE);
		clientDao.save(client);
		}

	public void updateClientDetails(Client client) {
		clientDao.save(client);
	}

	public void removeClient(Long clientId) {
        clientDao.getById(clientId).setClientActiveState(ClientActiveState.DELETED);
	}

	public Client getClientById(Long clientId) {
		return clientDao.getById(clientId);
	}

	public List<Client> getClientsByName(String clientName) {
		return clientDao.getClientsByName(clientName);
	}

	public List<Client> getClientsByEmail(String clientEmail) {
		return clientDao.getClientsByEmail(clientEmail);
	}

	public List<Client> getClientsByPhone(String clientPhone) {
		return clientDao.getClientsByPhone(clientPhone);
	}

	public List<Client> getClientsByAdress(String clientAdress) {
		return clientDao.getClientsByAdress(clientAdress);
	}

	public List<Client> getAllClients() {
		return clientDao.getAll();
	}

	public Account getClientAccount(Long clientId) {
		return accountDao.getAccountByClientId(clientId);
	}

	public List<Account> getAllAccounts() {
		return accountDao.getAll();
	}

	public List<Deposit> getClientDeposites(Long clientId) {
		return depositDao.getDepositesByClientId(clientId);
	}

	public List<Deposit> getAllDeposites() {
		return depositDao.getAll();
	}

	public List<Activity> getClientActivities(Long clientId) {
		return activityDao.getActivityByClientId(clientId);
	}

	public List<Activity> getAllActivities() {
		return activityDao.getAll();
	}

	public void updateSystemPropety(Property property) {
		propertyDao.save(property);
	}

	public Property getSystemPropertyValueByKey(String key) {
		return propertyDao.getById(key);
	}

	public List<Property> getAllSystemProperty() {
		return propertyDao.getAll();
	}

}
