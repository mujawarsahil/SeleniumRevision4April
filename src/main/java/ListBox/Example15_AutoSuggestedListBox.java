package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example15_AutoSuggestedListBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.bing.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@title='Close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("sb_form_q")).sendKeys("automation");
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='sa_ul']//li"));
	
		for(WebElement ele :list)
		{
			if(ele.getText().equals("automation tools"))
			{
				ele.click();
			}
		}
	}
	
	
}
