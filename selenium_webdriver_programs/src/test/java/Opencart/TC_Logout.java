package Opencart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC_Logout {

	public static void main(String[] args) throws InterruptedException
	{
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--headless=new");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://tutorialsninja.com/demo/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.xpath("//span[normalize-space()=\"My Account\"]")).click();
	    driver.findElement(By.xpath("//a[normalize-space()=\"Login\"]")).click();
	    driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys("pavanoltraining@gmail.com");
	    driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
	    driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
	    Thread.sleep(1800000);
	    
	    
	    		
	    
	    
	    driver.quit();
	}

}
