package com.epam.cdp.mbank.core.db.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.database.annotations.Transactional;
import org.unitils.database.util.TransactionMode;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.orm.jpa.JpaUnitils;
import org.unitils.orm.jpa.annotation.JpaEntityManagerFactory;
import org.unitils.reflectionassert.ReflectionAssert;

import com.epam.cdp.mbank.core.db.dao.AccountDao;
import com.epam.cdp.mbank.core.db.daoImpl.AccountDaoImpl;
import com.epam.cdp.mbank.model.Account;

@JpaEntityManagerFactory(persistenceUnit = "test", configFile = "/META-INF/persistence-test.xml")
@RunWith(UnitilsJUnit4TestClassRunner.class)
public class AccountDaoTest extends UnitilsJUnit4 {

	@PersistenceContext
	EntityManager entityManager;

	AccountDao ad;

	@Before
	public void setUp() {
		ad = new AccountDaoImpl();
		JpaUnitils.injectEntityManagerInto(ad);
	}

	@Test
	@DataSet("/dataset/account/AccountDaoTest.get.xml")
	public void getAll() {
		List<Account> actualObjects = ad.getAll();
		ReflectionAssert.assertPropertyLenientEquals("balance",
				Arrays.asList(1.0, 2.0, 3.0), actualObjects);

	}

	@Test
	@DataSet("/dataset/account/AccountDaoTest.save.xml")
	@ExpectedDataSet("/dataset/account/AccountDaoTest.save-result.xml")
	public void save() {
		Account account = new Account();
		account.setBalance(4.0);
		account.setComment("comment4");
		account.setCreditLimit(4.0);
		ad.save(account);
	}

	@Test
	@Transactional(TransactionMode.DISABLED)
	@DataSet("/dataset/account/AccountDaoTest.remove.xml")
	@ExpectedDataSet("/dataset/account/AccountDaoTest.remove-result.xml")
	public void remove() {
		List<Account> accounts = ad.getAll();
		ad.remove(accounts.get(2));
	}

}
