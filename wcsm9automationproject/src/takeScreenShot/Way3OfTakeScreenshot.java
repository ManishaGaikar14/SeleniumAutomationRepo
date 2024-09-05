package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3OfTakeScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		RemoteWebDriver rwd=(RemoteWebDriver) driver;
		File src = rwd.getScreenshotAs(OutputType.FILE);
		File desc = new File("./ScreenShots/flipkart.pdf");
		Files.copy(src, desc);
		driver.close();
	}
}
