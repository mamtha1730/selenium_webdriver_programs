package Practise_programs;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoItMultipleFileUploadDemo 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//input[@id='filesToUpload']"))).click().build().perform();
		Thread.sleep(2000);
    	Runtime.getRuntime().exec("C://AutoITFiles//FileUpload.exe"+" "+"C:\\Users\\ics-guest\\OneDrive\\Desktop\\orange.jpg");
		Thread.sleep(5000);
		System.out.println("Files are uploaded successfully");
		driver.quit();
		
		
	}
}
