package com.epam.cdp.mbank.core.db.dao;

import java.util.List;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Client;

public class ClientDao extends BaseDao<Client, Long> {

	private static final String CLIENT_GET_BY_ADRESS = "Client.getByAdress";
	private static final String CLIENT_GET_BY_PHONE = "Client.getByPhone";
	private static final String CLIENT_GET_BY_EMAIL = "Client.getByEmail";
	private static final String CLIENT_GET_BY_NAME = "Client.getByName";
	private static final String CLIENTS_FIND_ALL = "Clients.findAll";
	private static final String CLIENT_ACTIVE = "Client.Active";
	private static final String CLIENT_DELETE = "Client.Delete";

	@Override
	public Class<Client> getObjectClass() {
		return Client.class;
	}

	@Override
	protected String getSelectAllQuery() {
		return CLIENTS_FIND_ALL;
	}

	public int makeClientDeleted(Long clientId) {
		return createNamedQuery(CLIENT_DELETE).executeUpdate();
	}

	public int makeClientActive(Long clientId) {
		return createNamedQuery(CLIENT_ACTIVE).executeUpdate();

	}

	public List<Client> getClientsByName(String clientName) {
		return createNamedQuery(CLIENT_GET_BY_NAME).getResultList();
	}

	public List<Client> getClientsByEmail(String clientEmail) {
		return createNamedQuery(CLIENT_GET_BY_EMAIL).getResultList();
	}

	public List<Client> getClientsByPhone(String clientPhone) {
		return createNamedQuery(CLIENT_GET_BY_PHONE).getResultList();
	}

	public List<Client> getClientsByAdress(String clientAdress) {
		return createNamedQuery(CLIENT_GET_BY_ADRESS).getResultList();
	}

}
