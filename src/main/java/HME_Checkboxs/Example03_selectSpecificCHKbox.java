package HME_Checkboxs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example03_selectSpecificCHKbox 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.findElement(By.xpath("//input[@id='friday']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
