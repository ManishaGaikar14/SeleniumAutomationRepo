package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("laptop");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Brand\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Lenovo\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Core i7\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()=\"RAM Capacity\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"32 GB\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Screen Size\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"15 inch - 15.9 inch\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Operating System\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Windows 10\"]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()=\"Touch Screen\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[text()=\"Yes\"]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Processor Brand\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Intel\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Storage Type\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"SSD\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"3★ & above\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()=\"RAM Capacity\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"32 GB\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath(""))
	}
}
