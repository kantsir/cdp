package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Deposit;

public class DepositDao extends BaseDao<Deposit> {

    @Override
    public Class<Deposit> getObjectClass() {
	return Deposit.class;
    }

    @Override
    public String getSelectAllQuery() {
	return "Deposites.findAll";
    }

}
