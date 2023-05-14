package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example05_getCurrentUrl
{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
		
		Thread.sleep(3000);
		
	
		driver.quit();
		
	}
}
