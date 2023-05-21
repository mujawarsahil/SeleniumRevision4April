package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example05_Disable_Notification {

	public static void main(String[] args) {
		
		
		//Process 1---> notification popup is displayed
//		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.carwale.com/");
//		
		//Process 2---> Notification popup disabled
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.carwale.com/");
		
	}
}
