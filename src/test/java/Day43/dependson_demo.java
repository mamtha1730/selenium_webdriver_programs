package Day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependson_demo 
{  
	@Test(priority=1)
	void openapp()
	{
		System.out.println("1....");	
		Assert.assertTrue(true);
		
	}
	@Test(priority=2,dependsOnMethods= {"openapp"})
	void login()
	{
		System.out.println("2....");
		Assert.assertTrue(false);
	}
	
	@Test(priority=3, dependsOnMethods= { "openapp","login"})
	void search()
	{
		System.out.println("3....");
		Assert.assertTrue(true);
	}
	@Test(priority=4, dependsOnMethods= {"login","search"})
	void advsearch()
	{
		System.out.println("4....");
		Assert.assertTrue(true);
	}
}
