package Practise_programs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadRobot {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.grammarly.com/plagiarism-checker");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Upload a file']")).click();
		Thread.sleep(2000);
		Robot rb=new Robot();
		StringSelection str= new StringSelection("C:\\Users\\ics-guest\\OneDrive\\Desktop\\MAMTHA\\api test environment.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
	}

}
