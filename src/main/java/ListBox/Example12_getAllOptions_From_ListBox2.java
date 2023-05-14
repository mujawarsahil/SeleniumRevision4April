package ListBox;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example12_getAllOptions_From_ListBox2 
{

	public static void main(String[] args)
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select s = new Select(month);

		TreeSet<String> tset=new TreeSet<String>();
		
		List<WebElement> allOptions = s.getOptions();

		for (WebElement e : allOptions)
		{
			tset.add(e.getText() );
		}
		
		for(String str : tset)
		{
			System.out.println(str);
		}

	}
}