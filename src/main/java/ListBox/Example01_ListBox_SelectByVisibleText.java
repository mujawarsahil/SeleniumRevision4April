package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example01_ListBox_SelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		
		
		
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(3000);
	 
	  WebElement month=driver.findElement(By.id("month"));
	  Select s=new Select(month);
	  
	  s.selectByVisibleText("Apr");
	  
	  Thread.sleep(2000);
	  s.selectByValue("5");
	  
	  Thread.sleep(2000);
	  s.selectByIndex(7);
	  
	  /*//SelectByValue(String value);
	  Thread.sleep(3000);
	  WebElement day = driver.findElement(By.id("day"));
	  Select s1=new Select(day);
	  s1.selectByValue("27");
	  
	  Thread.sleep(3000);
	  
	  WebElement year= driver.findElement(By.id("year"));
	  Select s2=new Select(year);
	  s2.selectByIndex(1);
	  
	  */
	 
	  
	  Thread.sleep(5000);
	  driver.close();
		
	}

}
