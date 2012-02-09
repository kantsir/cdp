package com.epam.cdp.mbank;

import java.util.Arrays;
import java.util.List;

import org.hibernate.annotations.ForeignKey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.database.annotations.Transactional;
import org.unitils.database.util.TransactionMode;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.annotation.ExpectedDataSet;
import org.unitils.reflectionassert.ReflectionAssert;

import com.epam.cdp.mbank.core.db.dao.ClientDao;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.enums.ClientActiveState;


@RunWith(UnitilsJUnit4TestClassRunner.class)
public class ClientDaoTest extends UnitilsJUnit4 {

	ClientDao cd = new ClientDao();

	@Test
	@DataSet("dataset/client/ClientDaoTest.get.xml")
	public void getClientsByActiveStateACTIVE() {
		List<Client> clients = cd
				.getClientsByActiveState(ClientActiveState.ACTIVE);
		ReflectionAssert.assertPropertyLenientEquals("address", Arrays.asList(
				"testDatabaseFieldAddress1", "testDatabaseFieldAddress3"),
				clients);
	}

	@Test
	@DataSet("dataset/client/ClientDaoTest.get.xml")
	public void getClientsByActiveStateDELETED() {
		List<Client> clients = cd
				.getClientsByActiveState(ClientActiveState.DELETED);
		ReflectionAssert.assertPropertyLenientEquals("address",
				Arrays.asList("testDatabaseFieldAddress2"), clients);
	}

	@Test
	@DataSet("dataset/client/ClientDaoTest.get.xml")
	public void getClientsByName() {
		List<String> expectedPropertyValues = Arrays
				.asList("testDatabaseFieldAddress1");
		List<Client> clients = cd.getClientsByName("testDatabaseFieldName1");
		ReflectionAssert.assertPropertyLenientEquals("address",
				expectedPropertyValues, clients);
	}

	@Test
	@DataSet("dataset/client/ClientDaoTest.get.xml")
	public void getClientsByPhone() {
		List<String> expectedPropertyValues = Arrays
				.asList("testDatabaseFieldName2");
		List<Client> actualObjects = cd.getClientsByPhone("+2345678901");
		ReflectionAssert.assertPropertyLenientEquals("clientName",
				expectedPropertyValues, actualObjects);
	}

	@Test
	@DataSet("dataset/client/ClientDaoTest.get.xml")
	public void getClientsByEmail() {
		List<String> expectedPropertyValues = Arrays
				.asList("testDatabaseFieldName3");
		List<Client> actualObjects = cd
				.getClientsByEmail("testDatabaseField3@testDatabaseField.com");
		ReflectionAssert.assertPropertyLenientEquals("clientName",
				expectedPropertyValues, actualObjects);
	}

	@Test
	@DataSet("dataset/client/ClientDaoTest.get.xml")
	public void getClientsByAdress() {
		List<String> expectedPropertyValues = Arrays
				.asList("testDatabaseFieldName1");
		List<Client> actualObjects = cd
				.getClientsByAdress("testDatabaseFieldAddress1");
		ReflectionAssert.assertPropertyLenientEquals("clientName",
				expectedPropertyValues, actualObjects);
	}

	@Test
	@DataSet("dataset/client/ClientDaoTest.get.xml")
	public void getAll() {

		List<Client> actualObjects = cd.getAll();
		ReflectionAssert.assertPropertyLenientEquals("clientName", Arrays
				.asList("testDatabaseFieldName1", "testDatabaseFieldName2",
						"testDatabaseFieldName3"), actualObjects);
	}

	@Test
	@DataSet("dataset/client/ClientDaoTest.save.xml")
	@ExpectedDataSet("dataset/client/ClientDaoTest.save-result.xml")
	public void save() {
		Client client = new Client();
		client.setClientName("newClientName");
		cd.save(client);
	}

	@Test
	@Transactional(TransactionMode.DISABLED)
	@DataSet("dataset/client/ClientDaoTest.remove.xml")
	@ExpectedDataSet("dataset/client/ClientDaoTest.remove-result.xml")
	public void remove() {
		Client client = cd.getClientsByName("testDatabaseFieldName3").get(0);
		cd.remove(client);
	}

}
