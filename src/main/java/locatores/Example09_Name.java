package locatores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example09_Name {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("S:\\CODE\\SeleniumRevision\\ByTagName.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.name("fname")).sendKeys("M.Aadi");
		
		driver.findElement(By.name("mname")).sendKeys("Raj");
		
		driver.findElement(By.name("lname")).sendKeys("Mujawar");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
