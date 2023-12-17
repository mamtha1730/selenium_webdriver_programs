package Practise_programs;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch_window {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		URL url = new URL("https://www.google.com/");
		((JavascriptExecutor) driver).executeScript("window.open(arguments[0])", url);
		
	//	((JavascriptExecutor) driver).executeScript("window.open()");
		//ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(1));

		//driver.get("https://www.google.com/");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.TAB);
		// Opens Spark URL homepage in the newly opened tab
		driver.navigate().to("https://www.spark.co.nz/");
		
		boolean bool = driver.findElement(By.xpath("//img[@class='sparkdigital-logo']")).isDisplayed();
		System.out.println(bool);

		driver.findElement(By.xpath("//img[@src='/content/dam/telecomcms/content-images/personalisation/svg/black-icons/Phones.svg']")).click();
		Thread.sleep(2000);
		
		
	}

}
