package com.epam.cdp.mbank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.unitils.UnitilsJUnit4;
import org.unitils.UnitilsJUnit4TestClassRunner;
import org.unitils.database.annotations.Transactional;
import org.unitils.database.util.TransactionMode;
import org.unitils.dbunit.annotation.DataSet;

@RunWith(UnitilsJUnit4TestClassRunner.class)
public class ClientDaoTest extends UnitilsJUnit4 {

	@Test
	@DataSet("ClientDaoTest.findClientByID.xml")
	@Transactional(value=TransactionMode.ROLLBACK)
	public void firstTest(){
		
	}
}