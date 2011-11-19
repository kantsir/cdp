package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.BaseDao;
import com.epam.cdp.mbank.model.Deposit;

public class DepositDao extends BaseDao<Deposit> {

    public DepositDao(Class<Deposit> model) {
	super(model);
    }

    @Override
    public String getSelectAllQuery() {
	String result = "SELECT * FROM ACCOUNTS";
	return result;
    }

}
