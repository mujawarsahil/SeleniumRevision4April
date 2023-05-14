package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example05_isMultiple2
{
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("S:\\JavaSeleniumR\\SeleniumRevision4April\\multiselectListBox.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.id("123"));
		
		Select s= new Select(country);

		if(s.isMultiple())
		{
			System.out.println("List box is multiselectable!!!");
		}
		else
		{
			System.out.println("List box is single Selectable ");
		}
		
	}

}