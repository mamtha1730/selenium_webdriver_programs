package Day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicsxpath {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://testautomationpractice.blogspot.com/");
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("shirts");
		
		//driver.findElement(By.name("Submit")).click();
		
		//driver.findElement(By.linkText("My Account")).click();
		//driver.findElement(By.partialLinkText("My")).click();
		
		int count = driver.findElements(By.tagName("a")).size();
		System.out.println(count);
		
		//driver.quit();
		

	}

}
