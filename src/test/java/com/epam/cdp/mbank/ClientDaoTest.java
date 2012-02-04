package com.epam.cdp.mbank;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4;
import org.unitils.UnitilsJUnit4TestClassRunner;

import org.unitils.dbunit.annotation.DataSet;
import org.unitils.reflectionassert.ReflectionAssert;

import com.epam.cdp.mbank.core.db.dao.ClientDao;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.enums.ClientActiveState;

@RunWith(UnitilsJUnit4TestClassRunner.class)
public class ClientDaoTest extends UnitilsJUnit4 {

	@Test
	@DataSet("ClientDaoTest.clients.xml")
	public void firstTest() {

		ClientDao cd = new ClientDao();
		List<Client> clientsActual = cd
				.getClientsByActiveState(ClientActiveState.ACTIVE);

		ReflectionAssert.assertPropertyLenientEquals("clientName", Arrays
				.asList("testDatabaseFieldName1", "testDatabaseFieldName2",
						"testDatabaseFieldName3", "testDatabaseFieldName4",
						"testDatabaseFieldName5"), clientsActual);

	}

	@After
	public void revertLastChangesInDB() {
		System.out.println("Cleaning...");
	}
}