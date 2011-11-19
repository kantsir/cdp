package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.BaseDao;
import com.epam.cdp.mbank.model.Client;

public class ClientDao extends BaseDao<Client> {

    public ClientDao(Class<Client> model) {
	super(model);
    }

    @Override
    public String getSelectAllQuery() {
	String result = "SELECT * FROM CLIENTS";
	return result;
    }

}
