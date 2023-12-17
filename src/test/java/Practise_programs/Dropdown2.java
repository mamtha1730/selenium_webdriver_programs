package Practise_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException 
	{
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://testautomationpractice.blogspot.com/");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		   driver.manage().window().maximize();
		   
		   WebElement dropdown = driver.findElement(By.id("RESULT_RadioButton-3"));
		   
		   Select selectobj =  new Select(dropdown);
		   Thread.sleep(3000);
		   selectobj.selectByIndex(1);
		   Thread.sleep(3000);
		   selectobj.selectByValue("Radio-1");
		   Thread.sleep(3000);
		   
		   driver.quit();
		   System.out.println("done");
		   
		   
		   

	}

}
