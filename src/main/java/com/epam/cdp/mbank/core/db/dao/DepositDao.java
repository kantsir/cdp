package com.epam.cdp.mbank.core.db.dao;

import java.util.List;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Deposit;

public class DepositDao extends BaseDao<Deposit,Long> {

    private static final String DEPOSITES_GET_BY_CLIENT_ID = "Deposites.getByClientId";
	private static final String DEPOSITES_FIND_ALL = "Deposites.findAll";

	@Override
    public Class<Deposit> getObjectClass() {
	return Deposit.class;
    }

    @Override
    public String getSelectAllQuery() {
	return DEPOSITES_FIND_ALL;
    }

	public List<Deposit> getDepositesByClientId(Long clientId) {
		return createNamedQuery(DEPOSITES_GET_BY_CLIENT_ID).setParameter("clientId",clientId).getResultList();
	}

}
