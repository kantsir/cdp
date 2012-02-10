package com.epam.cdp.mbank;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.database.annotations.Transactional;
import org.unitils.database.util.TransactionMode;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.reflectionassert.ReflectionAssert;

import com.epam.cdp.mbank.core.db.daoImplementation.PropertyDao;
import com.epam.cdp.mbank.model.Property;

@RunWith(UnitilsJUnit4TestClassRunner.class)
public class PropertyDaoTest extends UnitilsJUnit4 {

	PropertyDao pd = new PropertyDao();

	@Test
	@DataSet("/dataset/property/PropertyDaoTest.get.xml")
	public void getAll() {
		List<Property> actualObjects = pd.getAll();
		ReflectionAssert.assertPropertyLenientEquals("propertyKey",
				Arrays.asList("key1", "key2", "key3"), actualObjects);
	}

	@Test
	@DataSet("/dataset/property/propertyDaoTest.save.xml")
	@ExpectedDataSet("/dataset/property/PropertyDaoTest.save-result.xml")
	public void save() {
		Property property = new Property("key100", "value100");
		pd.save(property);
	}

	@Test
	@Transactional(TransactionMode.DISABLED)
	@DataSet("/dataset/property/PropertyDaoTest.remove.xml")
	@ExpectedDataSet("/dataset/property/PropertyDaoTest.remove-result.xml")
	public void remove() {
		List<Property> properties = pd.getAll();
		pd.remove(properties.get(4));
	}

}
