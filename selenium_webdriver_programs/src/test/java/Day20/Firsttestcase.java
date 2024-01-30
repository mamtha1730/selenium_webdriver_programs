package Day20;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttestcase {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.saucedemo.com/");
		driver.get("https://demo.opencart.com/");
//		System.out.println(driver.manage().window().getSize());
//		Dimension d=new Dimension(1050,1060);
//		driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		System.out.println(driver.manage().window().getSize());
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
