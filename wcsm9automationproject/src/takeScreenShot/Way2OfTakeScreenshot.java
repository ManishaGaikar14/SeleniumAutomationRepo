package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.google.common.io.Files;

public class Way2OfTakeScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
	RemoteWebDriver	rwd=new ChromeDriver();
	rwd.manage().window().maximize();
	rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	rwd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(2000);
	rwd.findElement(By.name("username")).sendKeys("Admin");
	Thread.sleep(2000);
	rwd.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
	rwd.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	File src = rwd.getScreenshotAs(OutputType.FILE);
	File desc = new File("./ScreenShots/orange.png");
	Files.copy(src, desc);
	rwd.close();
	}
}
