package Practise_programs;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL myurl = new URL(url);
			HttpURLConnection myconn = (HttpURLConnection)myurl.openConnection();
			myconn.connect();
			
		
			//Thread.sleep(2000);
			int rescode = myconn.getResponseCode();
			if(rescode < 400)
				System.out.println(myurl+"-"+"is a valid link ");
			else
				System.out.println(myurl+"--"+"is invalid link ");
						
			
		}
		
	   }
	}