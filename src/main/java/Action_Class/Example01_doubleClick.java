package Action_Class;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example01_doubleClick {

	WebDriver driver=null;
	@BeforeTest
	public void OpenBrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick_addeventlistener");
		
	}
	@Test
	public void VerifyDoubleClick()
	{
		driver.switchTo().frame("iframeResult");
		
		WebElement link=driver.findElement(By.xpath("//p[@id='demo']"));

		Actions act =new Actions(driver) ;
		
		act.doubleClick(link).perform();

		
	}
	@AfterTest
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
