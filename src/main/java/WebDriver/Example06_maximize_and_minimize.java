package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example06_maximize_and_minimize 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);
		driver.manage().window().maximize();

		Thread.sleep(3000);
		driver.manage().window().minimize();

//		Options op1 = driver.manage();
//		Window win1 = op1.window();
//		win1.maximize();

	}

}
