package Practise_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class Automationpractice_website
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		
		/*
		System.out.println("Page Title:"+title);
		String url2 = driver.getCurrentUrl();
		System.out.println(url2);
		boolean bool= driver.getPageSource().contains("automation");
		System.out.println("page containing text automation: \t"+bool);
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Mamtha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mamtha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1232223");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("dfasgasfgadfhwhsghsfgnhsf cDFsdgasfg");
		Thread.sleep(2000);
		
		WebElement lnk_home=driver.findElement(By.linkText("Home"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",lnk_home);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
				
		WebElement female_radio= driver.findElement(By.xpath("//input[@id='female']"));
		boolean bool1= driver.findElement(By.xpath("//input[@id='female']")).isSelected();
		System.out.println(bool1);
		if (bool1 == false)
			female_radio.click();
		Thread.sleep(2000);
		
		List<WebElement> days=driver.findElements(By.xpath(" //input[@class='form-check-input' and @type='checkbox']"));
//		for(WebElement check:days)
//		{
//			check.click();
//		}
//		
		for(int i=4;i<days.size();i++)
		{
			days.get(i).click();
		}
		//driver.findElement(By.xpath(" //input[@id=\"monday\"]")).click();
		
		WebElement drpcountry= driver.findElement(By.xpath("//select[@id='country']"));
		
		Select select=new Select(drpcountry);
		//select.selectByIndex(1);
		Thread.sleep(2000);
		//select.selectByValue("usa");
		select.selectByVisibleText("Canada");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//option[@value='green']")).click();
		Thread.sleep(2000);
		
		
		
		WebElement open_cart= driver.findElement(By.linkText("open cart"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(open_cart).keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		List<String> winid=new ArrayList(driver.getWindowHandles());
			driver.switchTo().window(winid.get(1));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys("iphone");
			driver.findElement(By.xpath("//button[@class=\"btn btn-light btn-lg\"]")).click();
			
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		 winid=new ArrayList(driver.getWindowHandles());
		
		driver.switchTo().window(winid.get(0));
		WebElement btn_search=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		js.executeScript("arguments[0].scrollIntoView();",btn_search);
		System.out.println(" btn_id:" +js.executeScript("return window.pageYOffset;"));
		
		driver.findElement(By.xpath("//button[normalize-space()=\"Alert\"]")).click();
		Thread.sleep(4000);
		Alert myalert= driver.switchTo().alert();
		myalert.accept();
		driver.findElement(By.xpath(" //button[normalize-space()=\"Confirm Box\"]")).click();
		myalert=driver.switchTo().alert();
		Thread.sleep(3000);
		myalert.dismiss();
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Prompt']")).click();
		Thread.sleep(2000); 
		myalert = driver.switchTo().alert();
		
		String text = myalert.getText();
		Thread.sleep(2000);
		System.out.println("Confirm Alert Text:"+text);
		Thread.sleep(2000);
		myalert.accept();
		
		
		WebElement field1= driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("Mamtha");
		WebElement btn_copy=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act1 = new Actions(driver);
		act1.doubleClick(btn_copy).perform();
		Thread.sleep(2000);
		
		WebElement source= driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		js.executeScript("arguments[0].scrollIntoView();",source);
		act1.dragAndDrop(source, target).perform();
		*/
		WebElement slider_start= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		//WebElement slider_end=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		int x_coord=slider_start.getLocation().getX();
		System.out.println("x coord"+x_coord);
		System.out.println("Slider pos:"+slider_start.getLocation());
		Actions act2=new Actions(driver);
	
		
		
		
		act2.moveToElement(slider_start)
		     .click()
		     .dragAndDropBy(slider_start, x_coord-200 , 0)
		     .build()
		     .perform();
		
		
		Thread.sleep(1000);
		System.out.println("After dragging Slider pos:"+slider_start.getLocation());
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("frame-one796456169");
		
		driver.quit();
	}



}