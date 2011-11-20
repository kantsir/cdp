package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.BaseDao;
import com.epam.cdp.mbank.model.Property;

public class PeopertyDao extends BaseDao<Property> {

    @Override
    public Class<Property> getObjectClass() {
	return Property.class;
    }

    @Override
    public String getSelectAllQuery() {
	String result = "SELECT * FROM PROPERTIES";
	return result;
    }


}
