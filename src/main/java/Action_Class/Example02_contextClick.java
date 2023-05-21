package Action_Class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example02_contextClick {

	WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void VerifyContextClick() throws IOException
	{
		
		WebElement btn=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act =new Actions(driver);
		
		act.contextClick(btn).perform();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg =new File("S:\\JavaSeleniumR\\SeleniumRevision4April\\Screenshot\\ContextClick.jpg");
		FileHandler.copy(src, trg);
	}
	
	
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}
	
}
