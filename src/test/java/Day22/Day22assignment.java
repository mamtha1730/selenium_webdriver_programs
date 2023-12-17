package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class Day22assignment {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		//Tag Name for active links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links in the webpage: "+links.size());
		
		//tagName for images
		List<WebElement> img_links = driver.findElements(By.tagName("img "));
		System.out.println("Number of images in the web page :"  +img_links.size());
		
		//link text
		boolean bool = driver.findElement(By.linkText("Contact")).isDisplayed();
		System.out.println("The display status of Contacts link :"+bool);
		Thread.sleep(3000);
		//Partial link text
		 driver.findElement(By.partialLinkText("Cart")).click();
		 Thread.sleep(2000);
		driver.close();

	}

}
