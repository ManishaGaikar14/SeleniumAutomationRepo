package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Frames\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"iframes\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Nested iframe\"]")).click();
		Thread.sleep(2000);
		WebElement FrameElement = driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
		driver.switchTo().frame(FrameElement);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("manisha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("manu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys("manu@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Sign Up\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
