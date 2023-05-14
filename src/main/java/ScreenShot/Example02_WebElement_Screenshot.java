package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.utility.RandomString;

public class Example02_WebElement_Screenshot {
	
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement logo=driver.findElement(By.xpath("(//img)[1]"));
		
		File src= logo.getScreenshotAs(OutputType.FILE);
		
		String r=RandomString.make(2);
		
		File trg=new File("S:\\JavaSeleniumR\\SeleniumRevision4April\\Screenshot\\sreenshot"+r+".jpg");
		org.openqa.selenium.io.FileHandler.copy(src, trg);
		
	}

}
