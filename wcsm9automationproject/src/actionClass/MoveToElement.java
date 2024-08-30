package actionClass;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@id=\"denyBtn\"]")).click();
		WebElement element = driver.findElement(By.xpath("//a[text()=\"Watch Jewellery \"]"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Band\"]")).click();
		driver.findElement(By.xpath("//span[@data-name=\"rs 0 to 10000\"]")).click();
		driver.findElement(By.xpath("(//img[@class=\"hc img-responsive center-block\"])[1]")).click();
		String ParentHandle = driver.getWindowHandle();
		Set<String> AllHandles = driver.getWindowHandles();
		for(String Wh:AllHandles) {
			if(!ParentHandle.equalsIgnoreCase(Wh)) {
				System.out.println("Child Address"+Wh);
				TargetLocator target = driver.switchTo();
				target.window(Wh).manage().window().maximize();
				Thread.sleep(2000);
			}
			else
				System.out.println("Parent Address"+Wh);
		}
		driver.findElement(By.xpath("//input[@placeholder=\"Pincode\"]")).sendKeys("411412");
		driver.findElement(By.xpath("//div[text()=\"Update\"]")).click();
		driver.findElement(By.xpath("(//input[@name=\"Submit\"])[1]")).click();
		driver.findElement(By.xpath("//span[text()=\"Move to Wishlist \"]")).click();
		driver.findElement(By.xpath("//a[@title=\"Close\"]")).click();
		driver.quit();
	}
}
