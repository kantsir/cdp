package com.epam.cdp.mbank.core.db.dao;

import com.epam.cdp.mbank.core.db.BaseDao;
import com.epam.cdp.mbank.model.Property;

public class PropertyDao extends BaseDao<Property,String> {

    private static final String PROPERTIES_FIND_ALL = "Properties.findAll";

	@Override
    public Class<Property> getObjectClass() {
	return Property.class;
    }

    @Override
    public String getSelectAllQuery() {
	return PROPERTIES_FIND_ALL;
    }
    

}
