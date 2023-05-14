package locatores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example06_xpathByTagname {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("S:\\CODE\\SeleniumRevision\\ByTagName.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.tagName("input")).sendKeys("sahil");
		
		driver.findElement(By.id("pass")).sendKeys("Rabiya");
	}

}
