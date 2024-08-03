package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jiocinema {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.jiocinema.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[id=\"navItem-Movies\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id=\"chip-5a713714_1698683357996\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[alt=\"right arrow\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"searchInputBox\"]")).sendKeys("ishqVishq");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[id=\"search-icon\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
