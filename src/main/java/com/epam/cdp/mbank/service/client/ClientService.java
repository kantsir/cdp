package com.epam.cdp.mbank.service.client;

import java.util.List;

import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;

public interface ClientService {

	public void updateClientDetails(Client client);

	public Client getAllClientInfo(Long id);

	public Account getClientAccountDetails();

	public List<Deposit> getClientDepositesDetails();

	public List<Activity> getClientActivitiesDetails();

	public Property getSystemPropertyValueByKey(String key);

	public List<Property> getAllSystemProperty();

}
