package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Example01_Fb_Page_Screenshot 
{
	
	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
//		WebElement fb=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
//		File src =fb.getScreenshotAs(OutputType.FILE);
		String testCaseID=RandomString.make(2);
		
		File trg=new File("S:\\JavaSeleniumR\\SeleniumRevision4April\\Screenshot\\sreenshot"+testCaseID+".jpg");
		
		FileHandler.copy(src, trg);
	
	}

}
