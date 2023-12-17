package Practise_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmenu {

	public static void main(String[] args) throws InterruptedException 
	{
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.saucedemo.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	   driver.manage().window().maximize();
	   //login
	   driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	   driver.findElement(By.xpath("//input[@id='login-button']")).click();
	   
	   //dropdown
	   WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
	   
	   Select  selectobj = new Select(dropdown);
	   
	   selectobj.selectByValue("lohi");
	   Thread.sleep(2000);
	   selectobj.selectByIndex(1);
	   Thread.sleep(2000);
	   selectobj.selectByVisibleText("Price (low to high");
	   Thread.sleep(2000);
	   
	   driver.quit();
	   System.out.println("done");
	   

}
}

