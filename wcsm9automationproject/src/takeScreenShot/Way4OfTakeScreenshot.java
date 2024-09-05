package takeScreenShot;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way4OfTakeScreenshot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]")).sendKeys("laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-reactid=\"909\"]")).click();
		Thread.sleep(2000);
		//EventFiringWebDriver efw = new EventFiringWebDriver(driver);
	}
}
