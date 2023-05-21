package HME_Checkboxs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01_PrintingAllLinksFromFB {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		
		int i=1;
		for(WebElement link:allLinks)
		{
			
			System.out.println("Link"+i+" "+link.getText());
			i++;
		}
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
