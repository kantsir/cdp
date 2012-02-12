package com.epam.cdp.mbank.core.db.daoImpl;

import org.springframework.stereotype.Repository;

import com.epam.cdp.mbank.core.db.dao.PropertyDao;
import com.epam.cdp.mbank.model.Property;

@Repository
public class PropertyDaoImpl extends AbstractBaseDao<Property,String> implements PropertyDao {

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
