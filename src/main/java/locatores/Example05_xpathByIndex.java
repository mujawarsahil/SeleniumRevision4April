package locatores;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_xpathByIndex {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//to click on "Create new account" we can find this element by using findBy Text() method
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//to find text box on create new account if we use input by text it will return multiple elements 
		//for that to select specific element we use index of particular element for that we can write 
		//query we write input by text method in parenthesis after that we use [index]
		//(//input by text)[index]
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ibrahim");//first name
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Mujawar");//last name
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9923878723");//mobile no.
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("270422");
		
		Thread.sleep(3000);
		
		//driver.quit();
		//Read the notes for Absolute xpath and Relative Xpath
		
		
		
		
		
	}
}
