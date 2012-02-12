package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.model.Account;

public interface AccountDao extends GenericDao<Account, Long> {

	public Account getAccountByClientId(Long clientId);

}
