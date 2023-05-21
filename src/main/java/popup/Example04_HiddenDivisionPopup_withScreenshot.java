package popup;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example04_HiddenDivisionPopup_withScreenshot {

	//WebDriver driver;
public static void main(String[] args) throws InterruptedException,IOException 
	

	{
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		//click on Account and List on Home Page
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		
		//click on Create your Amazon account
		
		driver.findElement(By.partialLinkText("Create your Amazon account")).click();
		
		Thread.sleep(2000);
		//nameFile---->in this case we do not pass any data for mandatory textbox to generate hiddenPopup
		driver.findElement(By.name("customerName")).sendKeys("");
		
		//mobileNo
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9923878723");
		
		//submit button click
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File trg=new File("S:\\JavaSeleniumR\\SeleniumRevision4April\\Screenshot\\fb.jpg");
		FileHandler.copy(src, trg);
	
	}
}
