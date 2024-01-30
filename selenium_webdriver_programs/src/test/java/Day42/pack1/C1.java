package Day42.pack1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1
{   @Test(priority=1)
	void abc()
	{
		System.out.println("abc of C1..");
	}
@BeforeTest
void bt()
{
	System.out.println("before test...");
}

@AfterTest
void at()
{
	System.out.println("After Test.....");
}
}
