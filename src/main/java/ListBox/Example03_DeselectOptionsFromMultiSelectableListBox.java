package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example03_DeselectOptionsFromMultiSelectableListBox 
{
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("S:\\JavaSeleniumR\\SeleniumRevision4April\\multiselectListBox.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement country = driver.findElement(By.id("123"));
		
		Select s= new Select(country);
		s.selectByVisibleText("Ind");//SelectByVisivleText
		s.selectByIndex(2);//select By Index base 0
		s.selectByValue("4");//select By value-String
		Thread.sleep(3000);
		
		s.deselectByVisibleText("Pak");//deSelectedByVisibleText()
		s.deselectByIndex(3);//deselectByIndex
		
		Thread.sleep(5000);
		s.selectByVisibleText("Ind");//SelectByVisivleText
		s.selectByIndex(2);//select By Index base 0
		s.selectByValue("4");//select By value-String
		
		
		Thread.sleep(3000);
		s.deselectAll();
		Thread.sleep(2000);
		driver.close();		
	}

}
