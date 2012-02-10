package com.epam.cdp.mbank.core.db.daoInterfaces;

import java.util.List;

import com.epam.cdp.mbank.model.Deposit;

public interface IDepositDao extends GenericDao<Deposit, Long> {

	public List<Deposit> getDepositesByClientId(Long clientId);

}
