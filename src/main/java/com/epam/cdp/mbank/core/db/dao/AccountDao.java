package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.BaseDao;
import com.epam.cdp.mbank.model.Account;

public class AccountDao extends BaseDao<Account> {

    @Override
    public Class<Account> getObjectClass() {
	return Account.class;
    }

    @Override
    public String getSelectAllQuery() {
	String result = "SELECT * FROM ACCOUNTS";
	return result;
    }


}
