package com.epam.cdp.mbank.service.admin;

import java.util.List;

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
import com.epam.cdp.mbank.model.enums.ClientActiveState;

@Service
public class AdminServiceImpl  implements AdminService {

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

	public void addNewClient(Client client) {
		client.setClientActiveState(ClientActiveState.ACTIVE);
		clientDao.save(client);
	}

	public void updateClientDetails(Client client) {
		clientDao.save(client);
	}

	public void removeClient(Long clientId) {
		clientDao.getById(clientId).setClientActiveState(
				ClientActiveState.DELETED);
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

	@Override
	public int getInt() {
		return 10;
	}

}
