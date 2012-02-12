package com.epam.cdp.mbank;

import java.util.Arrays;
import java.util.Calendar;
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

import com.epam.cdp.mbank.core.db.dao.ActivityDao;
import com.epam.cdp.mbank.core.db.daoImpl.ActivityDaoImpl;
import com.epam.cdp.mbank.model.Activity;

@RunWith(UnitilsJUnit4TestClassRunner.class)
public class ActivityDaoTest extends UnitilsJUnit4 {

	ActivityDao ad = new ActivityDaoImpl();

	@Test
	@DataSet("/dataset/activity/ActivityDaoTest.get.xml")
	public void getAll() {
		List<Activity> actualObjects = ad.getAll();
		ReflectionAssert.assertPropertyLenientEquals("amount",
				Arrays.asList(1.0, 2.0, 3.0), actualObjects);

	}

	@Test
	@DataSet("/dataset/activity/ActivityDaoTest.save.xml")
	@ExpectedDataSet("/dataset/activity/ActivityDaoTest.save-result.xml")
	public void save() {
		Activity activity = new Activity();
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(2012, 03, 14, 14, 14, 14);
		activity.setActivityDate(date);
		activity.setAmount(4.0);
		activity.setCommision(4.0);
		activity.setDescription("description4");
		ad.save(activity);
	}

	
	@Test
	@Transactional(TransactionMode.DISABLED)
	@DataSet("/dataset/activity/ActivityDaoTest.remove.xml")
	@ExpectedDataSet("/dataset/activity/ActivityDaoTest.remove-result.xml")
	public void remove() {
		List<Activity> accounts = ad.getAll();
		ad.remove(accounts.get(2));
	}

}
