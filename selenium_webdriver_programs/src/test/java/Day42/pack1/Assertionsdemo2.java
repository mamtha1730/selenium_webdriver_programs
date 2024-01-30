package Day42.pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionsdemo2
{
	@Test
	void strgcomp()
	{
		String act_text= "OpenCart";
		//Assert.assertEquals(act_text, "OpenCart1");
		if(act_text .equals("OpenCart1"))
		Assert.assertTrue(true);
		else
			Assert.assertTrue(false);
		
	}

}
