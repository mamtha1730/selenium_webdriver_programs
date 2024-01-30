package Day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day20assign {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			String act_title= driver.getTitle();
			if (act_title .equals("Swag Labs"))
			{
				System.out.println("Test case is passed");
			}else 
			{
				System.out.println("The test case is failed");
			}
			
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("standard_user");
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			
			Thread.sleep(2000);
			driver.quit();




	}

}
