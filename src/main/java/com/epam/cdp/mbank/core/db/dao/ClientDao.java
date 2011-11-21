package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Client;

public class ClientDao extends BaseDao<Client> {

    @Override
    public Class<Client> getObjectClass() {
	return Client.class;
    }

    @Override
    public String getSelectAllQuery() {
	return "Clients.findAll";
    }

 
}
