package keyWordDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant{
	static WebDriver driver;
	public void openBrowser() throws IOException {
		Flib flib = new Flib();
		String browserValue = flib.readDataFromProperty(Prop_Path,"Browser");
		String Url = flib.readDataFromProperty(Prop_Path, "URL");
		
		if (browserValue.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();		
		} else if(browserValue.equalsIgnoreCase("Firafox")) {
			driver=new FirefoxDriver();
		}else if(browserValue.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Invalid Browser Value");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(Url);
	}
	
	public void closeBrowser() {
		driver.quit();
	}
}
