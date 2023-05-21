package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example01_SwitchtoFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// WebElement iframe
		// =driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		// driver.switchTo().frame(iframe);// By passing WebElement;

		driver.switchTo().frame("iframeResult");// By passing String ID

		// driver.switchTo().frame("iframeResult"); // By Passing String FrameName

		// driver.switchTo().frame(2); //By passing int index ---> not working in this
		// case

		Thread.sleep(3000);
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Click me to display')]"));

		btn.click();
	}
}
