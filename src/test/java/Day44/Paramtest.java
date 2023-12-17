package Day44;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramtest
{
	WebDriver driver;
	@BeforeClass
	@Parameters({"browser"})
	
	void setup(String br)
	{
		switch(br)
		{
		case "chrome": driver = new ChromeDriver();break;
		case "edge": driver = new EdgeDriver();break;
		default: System.out.println("Invalid browser"); return;
		}
		//driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority = 1)
	void testlogo()
	{
	 boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	 Assert.assertEquals(logo, true);
	 }
	
	@Test(priority=2)
	void testhomepage()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	@Test(priority=3)
	void testurl()
	{
		Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
