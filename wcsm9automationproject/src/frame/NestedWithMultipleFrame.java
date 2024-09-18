package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedWithMultipleFrame {
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
		driver.findElement(By.xpath("//a[text()=\"Nested with Multiple iframe\"]")).click();
		Thread.sleep(2000);
		WebElement FrameElement = driver.findElement(By.xpath("//iframe[@class=\"w-full h-96\"]"));
		driver.switchTo().frame(FrameElement);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("manishagaikar1234@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
}
