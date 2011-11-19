package com.epam.cdp.mbank.db.transformers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.cdp.mbank.core.BaseTransformer;
import com.epam.cdp.mbank.model.Client;


public class ClientTransformer extends BaseTransformer<Client> {

	@Override
	public Client transformTo(ResultSet resultSet) {
		Client client = new Client();
		try {
			client.setClient_id(resultSet.getLong(1));
			//TODO write result set
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return client;
	}

}
