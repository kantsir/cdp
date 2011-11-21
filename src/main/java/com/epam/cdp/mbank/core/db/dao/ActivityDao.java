package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Activity;

public class ActivityDao extends BaseDao<Activity> {

    @Override
    public Class<Activity> getObjectClass() {
	return Activity.class;
    }

    @Override
    public String getSelectAllQuery() {
	return "Activities.findAll";
    }


}
