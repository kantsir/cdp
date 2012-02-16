package com.epam.cdp.mbank.core.db.dao;

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

import com.epam.cdp.mbank.core.db.dao.DepositDao;
import com.epam.cdp.mbank.core.db.daoImpl.DepositDaoImpl;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.enums.DepositType;

@RunWith(UnitilsJUnit4TestClassRunner.class)
public class DepositDaoTest extends UnitilsJUnit4 {

	DepositDao ad = new DepositDaoImpl();

	@Test
	@DataSet("/dataset/deposit/DepositDaoTest.get.xml")
	public void getAll() {
		List<Deposit> actualObjects = ad.getAll();
		ReflectionAssert.assertPropertyLenientEquals("balance",
				Arrays.asList(1.0, 2.0, 3.0), actualObjects);

	}

	@Test
	@DataSet("/dataset/deposit/DepositDaoTest.save.xml")
	@ExpectedDataSet("/dataset/deposit/DepositDaoTest.save-result.xml")
	public void save() {
		Deposit deposit = new Deposit();
		deposit.setBalance(4.0);

		Calendar closingDate = Calendar.getInstance();
		closingDate.clear();
		closingDate.set(2012, 11, 14, 14, 14, 14);
		deposit.setClosingDate(closingDate);

		Calendar openingDate = Calendar.getInstance();
		openingDate.clear();
		openingDate.set(2012, 10, 14, 11, 13, 13);
		deposit.setOpeningDate(openingDate);
		deposit.setType(DepositType.LONG);
		ad.save(deposit);
	}

	@Test
	@Transactional(TransactionMode.DISABLED)
	@DataSet("/dataset/deposit/DepositDaoTest.remove.xml")
	@ExpectedDataSet("/dataset/deposit/DepositDaoTest.remove-result.xml")
	public void remove() {
		List<Deposit> deposits = ad.getAll();
		ad.remove(deposits.get(2));
	}

}
