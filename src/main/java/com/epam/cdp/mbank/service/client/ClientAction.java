package com.epam.cdp.mbank.service.client;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;

@WebService(name="ClientActionPort",targetNamespace = "http://cdp.epam.com/ws/definitions")
public interface ClientAction{

	@WebMethod
    public void updateClientDetails(@WebParam(name = "client")Client client);

    @WebMethod
	public Client getAllClientInfo(@WebParam(name = "id")Long id);

    @WebMethod
	public Account getClientAccountDetails();

	public List<Deposit> getClientDepositesDetails();

	@WebMethod
	public List<Activity> getClientActivitiesDetails();

	@WebMethod
	public Property getSystemPropertyValueByKey(@WebParam(name = "key")String key);

	@WebMethod
	public List<Property> getAllSystemProperty();

}
