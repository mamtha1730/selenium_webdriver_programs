package Day20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttestcase {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.saucedemo.com/");
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String act_title= driver.getTitle();
		if (act_title .equals("Your Store"))
		{
			System.out.println("Test case is passed");
		}else 
		{
			System.out.println("The test case is failed");
		}
		
		Thread.sleep(2000);
		driver.quit();


}
}
