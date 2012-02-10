package com.epam.cdp.mbank.core.db.daoInterfaces;

import com.epam.cdp.mbank.model.Account;

public interface IAccountDao extends GenericDao<Account, Long> {

	public Account getAccountByClientId(Long clientId);

}
