package com.epam.cdp.mbank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.dbunit.dataset.Schema;
import org.unitils.dbunit.util.DataSetAssert;

import com.epam.cdp.mbank.core.db.dao.ClientDao;

@RunWith(UnitilsJUnit4TestClassRunner.class)
@DataSet("ClientDaoTest.xml")
public class ClientDaoTest extends UnitilsJUnit4 {

	ClientDao cd = new ClientDao();

	@Test
	public void test() {

	}

//	@Test
//	// @DataSet("ClientDaoTest.clients.xml")
//	public void save() {
//		ClientDao cd = new ClientDao();
//		Client client1 = cd.getById(new Long(4));
//		// client1.setClientName("newtestDatabaseFieldName4");
//		cd.save(client1);
//		List<Client> clients = cd.getClientsByName("testDatabaseFieldName4");
//		ReflectionAssert.assertPropertyLenientEquals("clientName",
//				Arrays.asList("testDatabaseFieldName4"), clients);
//
//	}
//
//	@Test
//	// @DataSet("ClientDaoTest.clients.xml")
//	public void confirmClientsByActiveState() {
//
//		long allClientsActualCount = cd.getAll().size();
//		long clientsActiveActualCount = cd.getClientsByActiveState(
//				ClientActiveState.ACTIVE).size();
//		long clientsDeleteActualCount = cd.getClientsByActiveState(
//				ClientActiveState.DELETED).size();
//
//		Assert.assertEquals(
//				clientsActiveActualCount + clientsDeleteActualCount,
//				allClientsActualCount);
//	}
//
//	@Test
//	// @DataSet("ClientDaoTest.clients.xml")
//	public void confirmClientsByName() {
//		List<Client> clients = cd.getClientsByName("testDatabaseFieldName1");
//		ReflectionAssert.assertPropertyLenientEquals("clientName",
//				Arrays.asList("testDatabaseFieldName1"), clients);
//		ReflectionAssert.assertPropertyLenientEquals("id", Arrays.asList(1),
//				clients);
//	}
//
//	@Test
//	// @DataSet("ClientDaoTest.clients.xml")
//	public void confirmClientByPhone() {
//		List<Client> clients = cd.getClientsByPhone("+4567890123");
//		ReflectionAssert.assertPropertyLenientEquals("id", Arrays.asList(4),
//				clients);
//	}

	@Test
	//@DataSet("ClientDaoTest.xml")
	//@ExpectedDataSet
	public void confirmClientsByEmail() {
//		List<Client> clients = cd
//				.getClientsByEmail("testDatabaseField3@testDatabaseField.com");
//		ReflectionAssert.assertPropertyLenientEquals("email",
//				Arrays.asList("testDatabaseField3@testDatabaseField.com"),
//				clients);
		
		
		DataSetAssert ass = new DataSetAssert();
		Schema arg0= new Schema("ClientDaoTest.xml");
		Schema arg1= new Schema("ClientDaoTest.xml");
		
		System.out.println(arg0.getName()+"bla-bla-bla");
	//	System.out.println(arg0.getTable("clients").getRows().get(0)+"bla-bla-bla");
		
		ass.
		ass.assertEqualSchemas(arg0, arg1);
		

	}
}
