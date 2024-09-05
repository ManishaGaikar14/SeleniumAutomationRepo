package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("search_query")).sendKeys("coins");
		Thread.sleep(2000);
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);;
		driver.findElement(By.id("pid_7859")).click();
		Thread.sleep(2000);
		String ParentHandle = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> AllHandles = driver.getWindowHandles();
		for(String WH:AllHandles) {
			if (!ParentHandle.equals(WH)) {
				System.out.println(WH+"Address Of Child Handles");
				TargetLocator switchto = driver.switchTo();
				switchto.window(WH);
				TakesScreenshot ts=(TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				File desc = new File("./ScreenShots/Coins1.png");
				Files.copy(src, desc);
			}
			else
			{
				System.out.println(WH+"Address Of ParentHandle");
			}
		}
	}
}
