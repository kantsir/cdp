package com.epam.cdp.mbank.core.db.transformers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.cdp.mbank.core.BaseTransformer;
import com.epam.cdp.mbank.model.Deposit;


public class DepositTransformer extends BaseTransformer<Deposit> {

	@Override
	public Deposit transformTo(ResultSet resultSet) {
		Deposit deposit = new Deposit();
		try {
			deposit.setId(resultSet.getLong(1));
			//TODO write result set
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deposit;
	}

}
