package Practise_programs;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UploadFileAutoIT2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mamtha");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Vel");
		
		WebElement icon=driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", icon);
		
		Runtime.getRuntime().exec("C://AutoITFiles//FileUpload.exe"+" "+"C:\\Users\\ics-guest\\OneDrive\\Desktop\\orange.jpg");
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
