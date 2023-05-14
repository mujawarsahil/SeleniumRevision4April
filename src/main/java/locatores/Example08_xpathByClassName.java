package locatores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example08_xpathByClassName {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("S:\\CODE\\SeleniumRevision\\ByTagName.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.className("username")).sendKeys("M.Aadi");
		
		driver.findElement(By.className("password")).sendKeys("Ibrahim");
		
		Thread.sleep(3000);
		driver.quit();
	}

}

