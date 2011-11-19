package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.BaseDao;
import com.epam.cdp.mbank.model.Account;

public class AccountDao extends BaseDao<Account> {

    public AccountDao(Class<Account> model) {
	super(model);
    }

    @Override
    public String getSelectAllQuery() {
	String result = "SELECT * FROM ACCOUNTS";
	return result;
    }

}
