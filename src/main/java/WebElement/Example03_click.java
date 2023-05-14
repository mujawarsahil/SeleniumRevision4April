package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example03_click {

	public static void main(String[] args) throws InterruptedException {
		
		
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9923878723");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9011255199");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button")).click();

		
	
	}
}
