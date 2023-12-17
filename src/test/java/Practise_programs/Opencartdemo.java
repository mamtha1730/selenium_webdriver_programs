package Practise_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Opencartdemo
{

	public WebDriver driver;
	@BeforeClass
	void setup() throws InterruptedException
	{
		 driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
		
	@Test(priority=1 )
	void testlogin() throws InterruptedException
	{
		JavascriptExecutor  js =  (JavascriptExecutor)driver;
		
		WebElement btn_login = driver.findElement(By.cssSelector("#login2"));
		js.executeScript("arguments[0].click();", btn_login);
		//driver.findElement(By.xpath("//a[@class='nav-link' and @data-target='#logInModal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("marvel123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Marvel@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary' and @onclick='logIn()']")).click();
		String act_title= driver.getTitle();
		
		Assert.assertEquals(driver.getTitle(),"STORE");
		Thread.sleep(3000);
				
		        String text1 = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
		        if(text1 .equals("Welcome marvel123"))
		        Assert.assertTrue(true);
		        boolean bool = driver.findElement(By.xpath("//a[@class='nav-link' and @id='nameofuser']")).isDisplayed();
				Thread.sleep(3000);
				if(bool == true)
					Assert.assertTrue(true);
				
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
