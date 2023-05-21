package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example02_SwitchtoMainPageFromFrame {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		//SwitchTo frame
		driver.switchTo().frame("iframeResult") 		;// By passing String ID
		
		//By passing int index ---> not working in this case
		
		Thread.sleep(3000);
		WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]"));
		
		btn.click();
		
		//Switch to main Frame
		
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	
		
		
		
	}
}
