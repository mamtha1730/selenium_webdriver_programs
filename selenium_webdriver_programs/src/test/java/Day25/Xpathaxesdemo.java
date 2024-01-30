	package Day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Xpathaxesdemo {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		String txt = driver.findElement(By.xpath("//a[contains(text(),'RBL Bank')]/self::a")).getText();
		System.out.println(txt);
		driver.quit();

	}

}
