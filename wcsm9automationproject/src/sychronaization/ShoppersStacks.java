package sychronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStacks {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"featuredProducts_cardBody__l4gLE\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		Thread.sleep(2000);
		driver.findElement(By.name("Check")).click();
	}
}
