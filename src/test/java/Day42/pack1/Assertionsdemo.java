package Day42.pack1;

import org.testng.annotations.Test;

public class Assertionsdemo 
{
	@Test
	void strgcomp()
	{
		String act_text= "OpenCart";
		if(act_text .equals("opencart123"))
				{
			System.out.println("test is passed");
				}else
				{
					System.out.println("test is failed");
				}
	}
}
