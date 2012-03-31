package com.epam.cdp.mbank.core.db.daoImpl;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.epam.cdp.mbank.core.db.dao.ActivityDao;
import com.epam.cdp.mbank.model.Activity;

@Repository
public class ActivityDaoImpl extends AbstractBaseDao<Activity,Long> implements ActivityDao {

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

    @Transactional
	public List<Activity> getActivityByClientId(Long clientId) {
		return createNamedQuery(ACTIVITY_GET_BY_CLIENT_ID).setParameter("clientId",clientId).getResultList();
	}


}
