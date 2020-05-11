import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginScript 
{
   WebDriver driver;
	@Test
	public void browserLaunch()
	{
		String driverPath =System.getProperty("user.dir") + "\\src\\test\\java\\BrowserDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		driver=new ChromeDriver();
		
	}

}
