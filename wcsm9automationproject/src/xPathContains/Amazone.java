package xPathContains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,\"twotabsearchtextbox\")]")).sendKeys("krishna murti");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,\"nav-search-submit-button\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@id,\"p_90/6741117031\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),\"Religious\")])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),\"50% Off or more\")]")).click();
	}
}
