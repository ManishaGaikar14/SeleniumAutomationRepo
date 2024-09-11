package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogSpot {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,500)");
		//jse.executeScript("window.scrollBy(500,0)");
		//jse.executeScript("window.scrollBy(-500,0)");
		Thread.sleep(2000);
		Object seleniumtutorial = driver.findElement(By.xpath("(//a[@id=\"link2\"])[2]"));
		jse.executeScript("arguments[0].click();",seleniumtutorial);
		Thread.sleep(2000);
		driver.quit();
	}
}
