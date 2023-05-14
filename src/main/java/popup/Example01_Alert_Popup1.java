package popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01_Alert_Popup1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

		driver.findElement(By.name("cusid")).sendKeys("12");
		driver.findElement(By.name("submit")).click();
		
		Alert alt =driver.switchTo().alert();
		String text=alt.getText();
		
		System.out.println(text);
		Thread.sleep(2000);
		
		alt.accept();
		
		Alert alt1 = driver.switchTo().alert();
		
		System.out.println(alt.getText());

		Thread.sleep(2000);
		
		alt1.accept();
	}
}
