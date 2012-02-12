package com.epam.cdp.mbank.core.db.dao;

import java.util.List;

import com.epam.cdp.mbank.model.Deposit;

public interface DepositDao extends GenericDao<Deposit, Long> {

	public List<Deposit> getDepositesByClientId(Long clientId);

}
