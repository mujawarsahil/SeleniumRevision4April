package ListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example06_getSelectedOptionFrom_SingleSelected_ListBox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s= new Select(month);
		
		WebElement defaultMonth  = s.getFirstSelectedOption();
		
		String text=defaultMonth.getText();
		System.out.println("First Selected Option is "+ text);
		
	}
}
