package Day43.grouping;

import org.testng.annotations.Test;

public class Payments 
{
    @Test(priority = 2 , groups = {"sanity","regression"})
	void paymentinrupes()
	{
		System.out.println("This is payment in rupees");
	}
    @Test(priority = 5 , groups = { "sanity","regression"})
	void paymentindollars()
	{
		System.out.println("This is payment in dollars");
	}
}
