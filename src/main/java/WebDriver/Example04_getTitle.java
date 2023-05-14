package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example04_getTitle
{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		String title=driver.getTitle();
		System.out.println(title);
	
		
		Thread.sleep(3000);
		
	
		driver.quit();
		
	}
}
