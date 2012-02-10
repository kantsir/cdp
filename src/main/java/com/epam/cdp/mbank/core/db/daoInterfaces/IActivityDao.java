package com.epam.cdp.mbank.core.db.daoInterfaces;

import java.util.List;

import com.epam.cdp.mbank.model.Activity;

public interface IActivityDao extends GenericDao<Activity, Long> {

	public List<Activity> getActivityByClientId(Long clientId);

}
