package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdemo {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//b[@class=\"caret\"]")).click();
		
		//1) select single option
		driver.findElement(By.xpath("//input[@value='jQuery']")).click();
		
		//capture all options
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']"));
		// System.out.println("Total elements in select option"+options.size());
		
		 /*for(WebElement opt:options)
		{
		  System.out.println(opt.getText());
		}*/
		 
		//4)select multi option
		for(WebElement opt:options)
		{
			if(opt.getText().equals("MySQL")||opt.getText().equals("Oracle"))
			{
				Thread.sleep(2000);
				opt.click();
			}
		}

	}

}
