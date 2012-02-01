package com.epam.cdp.mbank.core.db.dao;

import java.util.List;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.enums.ClientActiveState;

public class ClientDao extends BaseDao<Client, Long> {

	private static final String CLIENTS_GET_BY_ADRESS = "Clients.getByAdress";
	private static final String CLIENTS_GET_BY_PHONE = "Clients.getByPhone";
	private static final String CLIENTS_GET_BY_EMAIL = "Clients.getByEmail";
	private static final String CLIENTS_GET_BY_NAME = "Clients.getByName";
	private static final String CLIENTS_GET_ALL = "Clients.getAll";
	private static final String CLIENTS_GET_ALL_BY_ACTIVESTATE = "Clients.getByActiveState";
	

	@Override
	public Class<Client> getObjectClass() {
		return Client.class;
	}

	@Override
	protected String getSelectAllQuery() {
		return CLIENTS_GET_ALL;
	}

	public List<Client> getClientsByActiveState(ClientActiveState clientActiveState) {
		return createNamedQuery(CLIENTS_GET_ALL_BY_ACTIVESTATE).getResultList();
	}

	public List<Client> getClientsByName(String clientName) {
		return createNamedQuery(CLIENTS_GET_BY_NAME).getResultList();
	}

	public List<Client> getClientsByEmail(String clientEmail) {
		return createNamedQuery(CLIENTS_GET_BY_EMAIL).getResultList();
	}

	public List<Client> getClientsByPhone(String clientPhone) {
		return createNamedQuery(CLIENTS_GET_BY_PHONE).getResultList();
	}

	public List<Client> getClientsByAdress(String clientAdress) {
		return createNamedQuery(CLIENTS_GET_BY_ADRESS).getResultList();
	}

}
