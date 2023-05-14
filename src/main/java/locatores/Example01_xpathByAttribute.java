package locatores;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01_xpathByAttribute 
{
	public static void main(String[] args) 
	{	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9923878723");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("9011255199");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
