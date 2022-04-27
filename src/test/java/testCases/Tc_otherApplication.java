package testCases;

import org.testng.annotations.Test;

import testBase.BaseClass;

public class Tc_otherApplication extends BaseClass{
	
	@Test
	public void testcase_application()
	{
		driver.get(rb.getString("appURL"));
	}
	
	
	

}
