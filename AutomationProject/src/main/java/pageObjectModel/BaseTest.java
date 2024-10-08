package pageObjectModel;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant {
	static WebDriver driver;
	public void setUp() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readDataFromProperty(Prop_Path,"Browser");
		String url = flib.readDataFromProperty(Prop_Path,"URL");
		if(browserValue.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("Firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browserValue.equalsIgnoreCase("Edge")) {
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Invalid BrowserValue..!!!");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	
	public void tearDown() 
	{
		driver.quit();
	}
}
