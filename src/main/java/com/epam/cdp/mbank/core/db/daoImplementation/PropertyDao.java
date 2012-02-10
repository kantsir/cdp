package com.epam.cdp.mbank.core.db.daoImplementation;

import com.epam.cdp.mbank.core.db.daoInterfaces.IPropertyDao;
import com.epam.cdp.mbank.model.Property;

public class PropertyDao extends AbstractBaseDao<Property,String> implements IPropertyDao {

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
