package com.epam.cdp.mbank.client;

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

public class ClientAction implements ClientActionInterface {

	private ClientDao clientDao;
	private AccountDao accountDao;
	private ActivityDao activityDao;
	private DepositDao depositDao;
	private PropertyDao propertyDao;

	public void updateClientDetails() {
		// TODO? how put client;
		Client client = null;
		clientDao.save(client);
	}

	public Client getAllClientInfo() {
		// TODO ? how put id
		Long id = null;
		return clientDao.getById(id);
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
