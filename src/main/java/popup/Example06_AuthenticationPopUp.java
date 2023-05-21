package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example06_AuthenticationPopUp 
{

	@Test
	public void loginTest() 
	{
		WebDriver driver = new ChromeDriver();

		driver.get("https:admin:admin@the-internet.herokuapp.com/basic_auth");

	}
}
