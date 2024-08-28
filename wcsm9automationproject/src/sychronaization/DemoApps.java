package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Synchronization\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class=\"pe-1 py-1 font-semibold flex items-center justify-between w-full text-sm whitespace-nowrap ps-3 flex-wrap hover:no-underline active:no-underline focus:no-underline text-black\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"With Timer\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Enter time in seconds\"]")).sendKeys("411402");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Start\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Pause\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
