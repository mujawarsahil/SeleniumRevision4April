package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_isEnable {

	public static void main(String[] args) throws InterruptedException {
		
		
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		boolean res = driver.findElement(By.xpath("//button")).isEnabled();
		
		if(res==true)
		{
			System.out.println("Login Button is Enabled ");
		}
		else
		{
			System.out.println("not Enabled");
		}
		;
			
	}
}
