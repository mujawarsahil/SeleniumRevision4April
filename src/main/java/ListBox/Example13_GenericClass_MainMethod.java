package ListBox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example13_GenericClass_MainMethod
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

	
		WebElement day=driver.findElement(By.name("birthday_day"));
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		WebElement year =driver.findElement(By.name("birthday_year"));
		
		
		Example13_ListBoxGenericMethod m1=new Example13_ListBoxGenericMethod();
		
				m1.ListBoxGenericMethod(day, "4");
				Thread.sleep(5000);
				m1.ListBoxGenericMethod(month, "Jan");
				Thread.sleep(5000);
				m1.ListBoxGenericMethod(year, "1990");
				
				
				
		
	}
		
}
