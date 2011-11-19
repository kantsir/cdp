package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.BaseDao;
import com.epam.cdp.mbank.model.Activity;

public class ActivityDao extends BaseDao<Activity> {

    public ActivityDao(Class<Activity> model) {
	super(model);
    }

    @Override
    public String getSelectAllQuery() {
	String result = "SELECT * FROM ACTIVITIES";
	return result;
    }

}
