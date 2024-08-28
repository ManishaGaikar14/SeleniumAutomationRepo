package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Synchronization\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Progress Bar\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"With Element Disappear\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter time in seconds\"]")).sendKeys("411402");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Start\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
