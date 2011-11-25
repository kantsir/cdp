package com.epam.cdp.mbank.core.db.dao;

import java.util.List;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Activity;

public class ActivityDao extends BaseDao<Activity,Long> {

    private static final String ACTIVITY_GET_BY_CLIENT_ID = "Activity.getByClientId";
	private static final String ACTIVITIES_FIND_ALL = "Activities.findAll";

	@Override
    public Class<Activity> getObjectClass() {
	return Activity.class;
    }

    @Override
    public String getSelectAllQuery() {
	return ACTIVITIES_FIND_ALL;
    }

	public List<Activity> getActivityByClientId(Long clientId) {
		return createNamedQuery(ACTIVITY_GET_BY_CLIENT_ID).getResultList();
	}


}
