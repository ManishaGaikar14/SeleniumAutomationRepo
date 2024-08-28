package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Link\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Link in New Tab\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Image\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Broken Image\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Link Image\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Images\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Without img Tag\"]")).click();
		driver.close();
	}
}
