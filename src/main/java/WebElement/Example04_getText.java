package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04_getText {

	public static void main(String[] args) throws InterruptedException {
		
		
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String text = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
		
		System.out.println(text);
			
	}
}
