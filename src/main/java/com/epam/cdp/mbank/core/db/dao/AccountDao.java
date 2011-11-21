package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Account;

public class AccountDao extends BaseDao<Account> {

    @Override
    public Class<Account> getObjectClass() {
	return Account.class;
    }

    @Override
    public String getSelectAllQuery() {
	return "Accounts.findAll";
    }


}
