package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1OfTakeScreenshot {
public static void main(String[] args) throws IOException, InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(20000);
	driver.findElement(By.xpath("//section[text()=\"Image\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()=\"Images\"]")).click();
	File src = driver.getScreenshotAs(OutputType.FILE);
	File desc = new File("./ScreenShots/Images.png");
	Files.copy(src, desc);
	driver.close();
}
}
