package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example09_getSizeSelectedOptionFrom_MultiSelectable_ListBox {

	public static void main(String[] args)
{
		
		WebDriver driver= new ChromeDriver();
		driver.get("S:\\JavaSeleniumR\\SeleniumRevision4April\\multiselectListBox.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.id("123"));
		
		Select s= new Select(country);
		s.selectByVisibleText("Ind");
		s.selectByVisibleText("Pak");
		
		s.selectByVisibleText("Shri");
		
		List<WebElement> allOptions = s.getAllSelectedOptions();
		
		int CountOfSelectedItems = allOptions.size();
		//System.out.println("First Selected Option on MultiSelectable ListBox is "+ firstopt);
		
		System.out.println("No. of Selected Items are :"+CountOfSelectedItems);
		
		
	}
}
