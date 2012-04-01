package com.epam.cdp.mbank.service.admin;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.reflectionassert.ReflectionAssert;
import org.unitils.spring.annotation.SpringApplicationContext;
import org.unitils.spring.annotation.SpringBeanByType;

import com.epam.cdp.mbank.model.Account;
import com.epam.cdp.mbank.model.Activity;
import com.epam.cdp.mbank.model.Client;
import com.epam.cdp.mbank.model.Deposit;
import com.epam.cdp.mbank.model.Property;

@SpringApplicationContext("classpath:WEB-INF/applicationContext.xml")
@DataSet("/dataset/AdminService.DataSet.xml")
public class AdminServiceTest extends UnitilsJUnit4 {

	@SpringBeanByType
	AdminService adminService;

	@Test
	public void getClientsByNameTest() {
		List<Client> clients = adminService
				.getClientsByName("testDatabaseFieldName1");
		List<String> expectedPropertyValues = Arrays
				.asList("testDatabaseFieldAddress1");
		ReflectionAssert.assertPropertyLenientEquals("address",
				expectedPropertyValues, clients);
	}

	@Test
	public void getClientAccountTest() {
		Account account = adminService.getClientAccount(new Long(1));
		Double expectedPropertyValues = 1.0;
		ReflectionAssert.assertPropertyLenientEquals("balance",
				expectedPropertyValues, account);
	}

	@Test
	public void getAllAccountsTest() {
		List<Account> accounts = adminService.getAllAccounts();
		List<Double> expectedPropertyValues = Arrays.asList(1.0, 2.0, 3.0);
		ReflectionAssert.assertPropertyLenientEquals("balance",
				expectedPropertyValues, accounts);
	}

	@Test
	public void getAllClientsTest() {
		List<Client> clients = adminService.getAllClients();
		List<String> expectedPropertyValues = Arrays.asList(
				"testDatabaseFieldName1", "testDatabaseFieldName2",
				"testDatabaseFieldName3");
		ReflectionAssert.assertPropertyLenientEquals("clientName",
				expectedPropertyValues, clients);
	}

	@Test
	public void getAllActivitiesTest() {
		List<Activity> activities = adminService.getAllActivities();
		List<Double> expectedPropertyValues = Arrays.asList(1.0, 2.0, 3.0, 4.0,
				5.0, 6.0);
		ReflectionAssert.assertPropertyLenientEquals("amount",
				expectedPropertyValues, activities);
	}

	@Test
	public void getAllDepositesTest() {
		List<Deposit> deposites = adminService.getAllDeposites();
		List<Double> expectedPropertyValues = Arrays.asList(1.0, 2.0, 3.0, 4.0,
				5.0, 6.0);
		ReflectionAssert.assertPropertyLenientEquals("balance",
				expectedPropertyValues, deposites);
	}

	@Test
	public void getAllSystemPropertyTest() {
		List<Property> properties = adminService.getAllSystemProperty();
		List<String> expectedPropertyValues = Arrays.asList("key1", "key2",
				"key3");
		ReflectionAssert.assertPropertyLenientEquals("propertyKey",
				expectedPropertyValues, properties);
	}

	@Test
	public void getClientInfoTest() {
		Client client = adminService.getClientById(new Long(1));
		Account clientAccount = client.getAccount();
		List<Activity> clientActivities = client.getActivities();
		List<Deposit> clientDeposites = client.getDeposites();

		Double expectedAccountBalanceValues = 1.0;
		List<Double> expectedActivityAmountValues = Arrays.asList(1.0, 4.0);
		List<Double> expectedDepositBalanceValues = Arrays
				.asList(1.0, 3.0, 6.0);

		ReflectionAssert.assertPropertyLenientEquals("balance",
				expectedAccountBalanceValues, clientAccount);
		ReflectionAssert.assertPropertyLenientEquals("amount",
				expectedActivityAmountValues, clientActivities);
		ReflectionAssert.assertPropertyLenientEquals("balance",
				expectedDepositBalanceValues, clientDeposites);
	}

	// Todo TESTS for removing needed. 
	// 2 variants:
	// 1)delete from db;
	//         or
	// 2)deleted status add

	
}