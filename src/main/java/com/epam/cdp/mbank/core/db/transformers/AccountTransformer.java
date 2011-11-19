package com.epam.cdp.mbank.core.db.transformers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.cdp.mbank.core.BaseTransformer;
import com.epam.cdp.mbank.model.Account;

public class AccountTransformer extends BaseTransformer<Account> {

	@Override
	public Account transformTo(ResultSet resultSet) {
		Account account = new Account();
		try {
			account.setId(resultSet.getLong(1));
			// TODO write result set

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return account;
	}

}
