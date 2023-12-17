package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Locatorsdemo {

	public static void main(String[] args)
	{
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		boolean bool = driver.findElement(By.className("img-fluid")).isDisplayed();
		System.out.println(bool);
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//link text and partial link text
		//driver.findElement(By.linkText("Tablets")).click();
		//driver.findElement(By.partialLinkText("Table")).click();
		List<WebElement> headerlink = driver.findElements(By.className("list-inline-item"));
		int count = headerlink.size();
		System.out.println(count);
		driver.close();
		//tag name
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links"+links);
		
		//tag name
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : "+images);
		
		
		
	}

}
