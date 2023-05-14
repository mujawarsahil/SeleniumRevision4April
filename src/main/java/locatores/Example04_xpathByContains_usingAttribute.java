package locatores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04_xpathByContains_usingAttribute 
{

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("123");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	}
}