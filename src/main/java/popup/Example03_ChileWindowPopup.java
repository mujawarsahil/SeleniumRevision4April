package popup;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Example03_ChileWindowPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
		WebElement as = driver.findElement(By.name("NewWindow"));
		
		as.click();
		Thread.sleep(3000);
		Set<String> ids = driver.getWindowHandles();
		
		ArrayList<String> a=new ArrayList<String>(ids);
		
		String childWindow=a.get(1);		
		driver.switchTo().window(childWindow);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Selenium")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Training")).click();
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(3000);
		
		String perantWindow=a.get(0);
		driver.switchTo().window(perantWindow);
		
		Thread.sleep(2000);
		driver.quit();
	}
}
