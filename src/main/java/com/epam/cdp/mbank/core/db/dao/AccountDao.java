package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Account;

public class AccountDao extends BaseDao<Account,Long> {

    private static final String ACCOUNTS_GET_BY_CLIENT_ID = "Accounts.getByClientId";
	private static final String ACCOUNTS_FIND_ALL = "Accounts.findAll";

	@Override
    public Class<Account> getObjectClass() {
	return Account.class;
    }

    @Override
    public String getSelectAllQuery() {
	return ACCOUNTS_FIND_ALL;
    }

	public Account getAccountByClientId(Long clientId) {
		return createNamedQuery(ACCOUNTS_GET_BY_CLIENT_ID).getSingleResult(); 
	}


}
