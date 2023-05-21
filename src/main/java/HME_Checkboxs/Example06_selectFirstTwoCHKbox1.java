package HME_Checkboxs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example06_selectFirstTwoCHKbox1 
 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		List<WebElement>week=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		
		
		for(int i=1;i<=2;i++)
		{
			for(WebElement day : week)
			{
				day.click();
			}
			
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
