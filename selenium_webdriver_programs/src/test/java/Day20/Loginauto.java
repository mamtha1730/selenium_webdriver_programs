package Day20;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;

public class Loginauto {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver =  null;
		System.out.println("Enter the browser you wish to run : (Edge/Chrome)");
		Scanner sc = new Scanner(System.in);
		String browser_name = sc.next();
		
		switch(browser_name) 
		{
		case "chrome": driver = new ChromeDriver();
						break;
		case "edge": 
					driver = new EdgeDriver();
					break;
		default: System.out.println(" Invalid browser name");
		}
		
		driver.get("https://demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("login2")).click();
		driver.findElement(By.id("loginusername")).sendKeys("Mamtha");
		driver.findElement(By.id("loginpassword")).sendKeys("Mamtha");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		Thread.sleep(2000);
		String act_title= driver.getTitle();
			if (act_title .equals("STORE"))
			{
				System.out.println("Test case is passed");
			}else 
			{
				System.out.println("The test case is failed");
			}
			Thread.sleep(2000);
			boolean status=driver.findElement(By.id("logout2")).isDisplayed();
			Thread.sleep(2000);
			if (status==true)
				{
				System.out.println("Logout button is dispaled- Success");
				}
			
			else
				{
				System.out.println("Logout button is not  displayed- Test case failed");
				}  
			Thread.sleep(2000);
			String text = driver.findElement(By.id("nameofuser")).getText();
			Thread.sleep(2000);
			System.out.println(text);
			
			if(text .contains("Mamtha"))
			{
				System.out.println("user name is dispalyed-success");
			}
			else 
			{
				System.out.println("User name is not dispalyed");
			}
			driver.close();
			}

}