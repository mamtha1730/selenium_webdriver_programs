package Day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csspractice {

	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("abc@gmail.com");		
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("input.inputtext[name=email]")).sendKeys("abc@gmail.com");

	}

}
