package Day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfunctions_demo {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://accounts.lambdatest.com/register");
		//driver.findElement(By.xpath("//input[@name='email' and  @placeholder='Business Email*']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@name='email' or  @placeholder='Business Email*']")).sendKeys("xyz@gmail.com");
		//driver.findElement(By.xpath("//a[contains(text(),'Cookie')]")).click();
		//driver.findElement(By.xpath("//a[starts-with(text(),'Coo')]")).click();
		driver.findElement(By.xpath("//a[text()='Cookie Policy']")).click();
		

	}

}
