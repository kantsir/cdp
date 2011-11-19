package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.BaseDao;
import com.epam.cdp.mbank.model.Property;

public class PeopertyDao extends BaseDao<Property> {

    public PeopertyDao(Class<Property> model) {
	super(model);
    }

    @Override
    public String getSelectAllQuery() {
	String result = "SELECT * FROM PROPERTIES";
	return result;
    }

}
