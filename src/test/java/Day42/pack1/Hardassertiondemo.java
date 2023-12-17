package Day42.pack1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardassertiondemo
{
	@Test
	void strg()
	{
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals("abc", "abc1","Both values are not same");
		sa.assertEquals(1, 1);
		sa.assertAll();
	}
	@Test
	void harddemo()
	{    SoftAssert sa = new SoftAssert();
		System.out.println("testing...");
		System.out.println("testing...");
		sa.assertEquals(1, 2,"Mismatch");
		System.out.println("testing...");
		Assert.assertEquals(2, 2);
		sa.assertAll();
	}
}
