package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Sample003_MoveInner_To_OuterFrame {
	
	@Test
	public void VerifyNavigationInnerToOuter() throws InterruptedException
	{
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.switchTo().frame("iframeResult");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Iframe Example']")));
		
		WebElement htag = driver.findElement(By.xpath("/html/body/h1"));
		
		String mostinnerHTML=htag.getText();
		
		System.out.println("Most Inner Frame :"+mostinnerHTML);
	
		//parentFrame ----> for child to immediate parent 
		driver.switchTo().parentFrame();
		
		WebElement immediateOuter =driver.findElement(By.xpath("/html/body/p"));
		
		String otext=immediateOuter.getText();
		
		System.out.println("Outer  frame data :"+otext);
		
		//defalutlContent ----> for any child to home page
		driver.switchTo().defaultContent();
		
		Thread.sleep(5000);

		
		driver.quit();
	}

}
