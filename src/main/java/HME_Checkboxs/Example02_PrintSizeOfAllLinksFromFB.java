package HME_Checkboxs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example02_PrintSizeOfAllLinksFromFB {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		/*First Approach 
		 * List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int linkSize=allLinks.size();
		System.out.println("Total links avaiable in FB homePage are :"+linkSize);
		*/
		
		//method chaining 
		int size=driver.findElements(By.xpath("//a")).size();
		System.out.println("size "+size);
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
