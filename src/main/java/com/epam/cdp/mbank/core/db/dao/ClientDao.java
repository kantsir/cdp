package com.epam.cdp.mbank.core.db.dao;

import java.util.List;

import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.enums.ClientActiveState;

public interface ClientDao extends GenericDao<Client, Long> {

	public List<Client> getClientsByActiveState(
			ClientActiveState clientActiveState);

	public List<Client> getClientsByName(String clientName);

	public List<Client> getClientsByEmail(String clientEmail);

	public List<Client> getClientsByPhone(String clientPhone);

	public List<Client> getClientsByAdress(String clientAdress);
}
