package cssSelector;

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
		driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("Mobiles");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("svg[viewBox=\"0 0 24 24\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
