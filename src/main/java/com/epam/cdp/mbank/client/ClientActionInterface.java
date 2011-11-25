package com.epam.cdp.mbank.client;

import java.util.List;

import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;

public interface ClientActionInterface {

	public void updateClientDetails();

	public Client getAllClientInfo();

	public Account getClientAccountDetails();

	public List<Deposit> getClientDepositesDetails();

	public List<Activity> getClientActivitiesDetails();

	public Property getSystemPropertyValueByKey(String key);

	public List<Property> getAllSystemProperty();

}
