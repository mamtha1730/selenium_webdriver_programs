package Day42.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C2 {
	@Test(priority=2)
	void pqr()
	{
		System.out.println("pqr of C2..");
	}
	@BeforeSuite()
	void befsuite()
	{
		System.out.println("Before suite...");
	}
	
	@AfterSuite
	void aftsuit()
	{
		System.out.println("After suite...");
	}
}
