package com.epam.cdp.mbank.core.db.daoImplementation;

import com.epam.cdp.mbank.core.db.daoInterfaces.IAccountDao;
import com.epam.cdp.mbank.model.Account;

public class AccountDao extends AbstractBaseDao<Account, Long> implements IAccountDao {

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
		return createNamedQuery(ACCOUNTS_GET_BY_CLIENT_ID).setParameter(
				"clientId", clientId).getSingleResult();
	}

}
