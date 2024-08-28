package xPathContains;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@class,\"Pke_EE\")]")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@title,\"Search for Products, Brands and More\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"_6i1qKy\" and (text()=\"SAMSUNG\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@title,\"4★ & above\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),\"6 GB\")][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),\"Operating System\")][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),\"Android\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),\"Sim Type\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),\"Dual Sim\")][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),\"50% or more\")][1]")).click();
		Thread.sleep(2000);
		//Defendant and independent method of Xpath
		driver.findElement(By.xpath("//div[text()=\"₹9,499\"]/ancestor::div[@class=\"yKfJKb row\"]/descendant::div[@class=\"KzDlHZ\"]")).click();
		Thread.sleep(2000);
		String ParentHandle = driver.getWindowHandle();
		System.out.println(ParentHandle);
		Set<String> AllHandles = driver.getWindowHandles();
		System.out.println(AllHandles);
		for(String WH:AllHandles) {
			if (ParentHandle.equals(WH)) {
				System.out.println("Address Of Child Window"+WH);
				driver.switchTo().window(WH);
				driver.findElement(By.xpath("//button[contains(text(),\"NOTIFY ME\")]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[contains(text(),\"Deny\")]")).click();
				Thread.sleep(2000);
				driver.close();
			}
			else {
				System.out.println("Address Of Parent Window"+WH);
			}
		}
		
	}
}
