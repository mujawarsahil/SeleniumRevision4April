package WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example08_isSelected1{
//this is applicable for checkboxs and radiobutton
	public static void main(String[] args) throws InterruptedException {
		
		
	
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Create new ")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		boolean res = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		if(res==true)
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("element is  not selected ");
		}
			
	}
}
