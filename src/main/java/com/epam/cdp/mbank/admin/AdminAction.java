package com.epam.cdp.mbank.admin;

import java.util.List;

import com.epam.cdp.mbank.core.db.dao.AccountDao;
import com.epam.cdp.mbank.core.db.dao.ActivityDao;
import com.epam.cdp.mbank.core.db.dao.ClientDao;
import com.epam.cdp.mbank.core.db.dao.DepositDao;
import com.epam.cdp.mbank.core.db.dao.PropertyDao;
import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;

public class AdminAction implements AdminActionInterface {

	private ClientDao clientDao;
	private AccountDao accountDao;
	private ActivityDao activityDao;
	private DepositDao depositDao;
	private PropertyDao propertyDao;

	@Override
	public void addNewClient(Client client) {
		clientDao.save(client);
		clientDao.makeClientActive(client.getId());
	}

	@Override
	public void updateClientDetails(Client client) {
		clientDao.save(client);
	}

	@Override
	public void removeClient(Long clientId) {
		clientDao.makeClientDeleted(clientId);
	}

	@Override
	public Client getClientById(Long clientId) {
		return clientDao.getById(clientId);
	}

	@Override
	public List<Client> getClientsByName(String clientName) {
		return clientDao.getClientsByName(clientName);
	}

	@Override
	public List<Client> getClientsByEmail(String clientEmail) {
		return clientDao.getClientsByEmail(clientEmail);
	}

	@Override
	public List<Client> getClientsByPhone(String clientPhone) {
		return clientDao.getClientsByPhone(clientPhone);
	}

	@Override
	public List<Client> getClientsByAdress(String clientAdress) {
		return clientDao.getClientsByAdress(clientAdress);
	}

	@Override
	public List<Client> getAllClients() {
		return clientDao.getAll();
	}

	@Override
	public Account getClientAccount(Long clientId) {
		return accountDao.getAccountByClientId(clientId);
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountDao.getAll();
	}

	@Override
	public List<Deposit> getClientDeposites(Long clientId) {
		return depositDao.getDepositesByClientId(clientId);
	}

	@Override
	public List<Deposit> getAllDeposites() {
		return depositDao.getAll();
	}

	@Override
	public List<Activity> getClientActivities(Long clientId) {
		return activityDao.getActivityByClientId(clientId);
	}

	@Override
	public List<Activity> getAllActivities() {
		return activityDao.getAll();
	}

	@Override
	public void updateSystemPropety(Property property) {
		propertyDao.save(property);
	}

	@Override
	public Property getSystemPropertyValueByKey(String key) {
		return propertyDao.getById(key);
	}

	@Override
	public List<Property> getAllSystemProperty() {
		return propertyDao.getAll();
	}

}
