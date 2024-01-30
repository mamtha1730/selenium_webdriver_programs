package Day42;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_class
{
	@BeforeTest
	void login()
	{
		System.out.println("Login ...");
	}
	@AfterTest
	void logout()
	{
		System.out.println("log out...");
	}
	@Test(priority=1)
	void search()
	{
		System.out.println("1. search");
	}
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("2.Adv search");
	}
	
}
