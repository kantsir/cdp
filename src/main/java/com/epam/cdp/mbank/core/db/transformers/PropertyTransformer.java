package com.epam.cdp.mbank.core.db.transformers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.cdp.mbank.core.BaseTransformer;
import com.epam.cdp.mbank.model.Property;

public class PropertyTransformer extends BaseTransformer<Property> {

	@Override
	public Property transformTo(ResultSet resultSet) {
		Property property = new Property();
		try {
			property.setProp_key(resultSet.getString(1));
			// TODO write result set

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return property;
	}

}
