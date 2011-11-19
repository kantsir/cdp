package com.epam.cdp.mbank.db.transformers;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.epam.cdp.mbank.core.BaseTransformer;
import com.epam.cdp.mbank.model.Activity;


public class ActivityTransformer extends BaseTransformer<Activity> {

	@Override
	public Activity transformTo(ResultSet resultSet) {
		Activity activity = new Activity();
		try {
			activity.setId(resultSet.getLong(1));
			//TODO write result set
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return activity;
	}

}
