package com.epam.cdp.mbank.core.db.dao;

import java.util.List;

import com.epam.cdp.mbank.model.Activity;

public interface ActivityDao extends GenericDao<Activity, Long> {

	public List<Activity> getActivityByClientId(Long clientId);

}
