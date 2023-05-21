package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example13_ListBoxGenericMethod
{

	public void ListBoxGenericMethod(WebElement monthListBox,String month) throws InterruptedException
	{
		
		Select s= new Select(monthListBox);
		List<WebElement> allopt = s.getOptions();
		
		for(WebElement e :allopt)
		{
			if(e.getText().equals(month))
			{
				e.click();
				Thread.sleep(2000);
			}
		}
		
		
		
	}
		
}
