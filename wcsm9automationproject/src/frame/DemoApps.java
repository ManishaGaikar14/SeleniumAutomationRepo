package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Frames\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"iframes\"]")).click();
		Thread.sleep(2000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
		Thread.sleep(2000);
		driver.switchTo().frame(frameElement);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("manisha");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("manisha123");
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
