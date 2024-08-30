package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()=\"Button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\"Double Click\"]")).click();
		Thread.sleep(2000);
		WebElement doubleclick1 = driver.findElement(By.xpath("//button[@id=\"btn20\"]"));
		Thread.sleep(2000);
		WebElement doubleclick2 = driver.findElement(By.xpath("//button[@id=\"btn22\"]"));
		Thread.sleep(2000);
		WebElement doubleclick3 = driver.findElement(By.xpath("//button[@id=\"btn26\"]"));
		Thread.sleep(2000);
		//object of action class
		Actions act = new Actions(driver);
		act.doubleClick(doubleclick1).perform();
		Thread.sleep(2000);
		act.doubleClick(doubleclick2).perform();
		Thread.sleep(2000);
		act.doubleClick(doubleclick3).perform();
		driver.close();
	}
}
