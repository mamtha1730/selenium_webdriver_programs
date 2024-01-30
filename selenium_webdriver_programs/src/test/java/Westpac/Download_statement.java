package Westpac;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download_statement {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().deleteAllCookies();
		driver.get("https://bank.westpac.co.nz/wone/app.html#login");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Page Title:"+title);
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		boolean bool= driver.getPageSource().contains("westpac");
		System.out.println("page containing text westpac: \t"+bool);
		
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("mamtha1730");
		driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Yazhini@909");
		driver.findElement(By.xpath("//button[@id='action-login']")).click();
		

	}

}
