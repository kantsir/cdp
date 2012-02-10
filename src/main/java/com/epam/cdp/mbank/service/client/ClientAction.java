package com.epam.cdp.mbank.service.client;

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

public class ClientAction implements ClientActionInterface {

	private ClientDao clientDao = new ClientDao();
	private AccountDao accountDao = new AccountDao();
	private ActivityDao activityDao = new ActivityDao();
	private DepositDao depositDao = new DepositDao();
	private PropertyDao propertyDao = new PropertyDao();

	public void updateClientDetails(Client client) {
		clientDao.save(client);
	}
	
	public Client getAllClientInfo(Long clientId) {
		return clientDao.getById(clientId);
	}

	public Account getClientAccountDetails() {
		Long clientId = null;
		return accountDao.getAccountByClientId(clientId);
	}

	public List<Deposit> getClientDepositesDetails() {
		Long clientId = null;
		return depositDao.getDepositesByClientId(clientId);
	}

	public List<Activity> getClientActivitiesDetails() {
		Long clientId = null;
		return activityDao.getActivityByClientId(clientId);
	}

	public Property getSystemPropertyValueByKey(String key) {
		return propertyDao.getById(key);
	}

	public List<Property> getAllSystemProperty() {
		return propertyDao.getAll();
	}

}
