package com.epam.cdp.mbank.service.client;

import java.util.List;

import javax.jws.WebService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

@Service
@WebService(serviceName = "ClientAction",
portName="ClientActionPort",
endpointInterface = "com.epam.cdp.mbank.service.client.ClientAction",
targetNamespace = "http://cdp.epam.com/ws/client",
wsdlLocation = "WEB-INF/wsdl/ClientAction.wsdl")
public class ClientActionImpl implements ClientAction {

	@Autowired
	private ClientDao clientDao;
	
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private ActivityDao activityDao;
	
	@Autowired
	private DepositDao depositDao;
	
	@Autowired
	private PropertyDao propertyDao;

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

	
//----------------get/set-----------------------------------//
	public ClientDao getClientDao() {
		return clientDao;
	}

	public void setClientDao(ClientDao clientDao) {
		this.clientDao = clientDao;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public ActivityDao getActivityDao() {
		return activityDao;
	}

	public void setActivityDao(ActivityDao activityDao) {
		this.activityDao = activityDao;
	}

	public DepositDao getDepositDao() {
		return depositDao;
	}

	public void setDepositDao(DepositDao depositDao) {
		this.depositDao = depositDao;
	}

	public PropertyDao getPropertyDao() {
		return propertyDao;
	}

	public void setPropertyDao(PropertyDao propertyDao) {
		this.propertyDao = propertyDao;
	}

}
