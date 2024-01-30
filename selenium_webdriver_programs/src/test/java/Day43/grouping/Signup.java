package Day43.grouping;

import org.testng.annotations.Test;

public class Signup
{    
	@Test (priority = 2 , groups = {"regression"})
	void signupbytwitter() 
	{
		System.out.println("this is signup by twitter");
	}
	
	@Test(priority=3 , groups = {"regression"})
	void signupbyfacebook()
	{
		System.out.println("This is signup by facebook");
	}
	
	@Test(priority=4 , groups= {"regression"})
	void signupbygoogle()
	{
		System.out.println("This is signup by Google");
	}
}
