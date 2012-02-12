package com.epam.cdp.mbank.core.db.daoImpl;

import org.springframework.stereotype.Repository;

import com.epam.cdp.mbank.core.db.dao.AccountDao;
import com.epam.cdp.mbank.model.Account;


@Repository
public class AccountDaoImpl extends AbstractBaseDao<Account, Long> implements AccountDao {

	private static final String ACCOUNTS_GET_BY_CLIENT_ID = "Accounts.getByClientId";
	public AccountDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

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
