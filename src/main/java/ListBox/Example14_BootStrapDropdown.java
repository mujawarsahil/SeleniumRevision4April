package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example14_BootStrapDropdown {

	
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		
		driver.findElement(By.xpath("//button[@id='menu1']")).click();
		Thread.sleep(2000);
		List<WebElement> alloptions=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		
		
		handlingOfBootstrapList(alloptions, "JavaScript");
		
	}
	
	public static void handlingOfBootstrapList(List<WebElement> alloptions,String option) throws InterruptedException
	{
		for(WebElement e : alloptions)
		{
			if(e.getText().equals(option))
			{
				e.click();
				Thread.sleep(2000);
		
			
			}
		}
	}
}
