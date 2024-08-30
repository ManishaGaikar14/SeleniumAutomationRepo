package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContaxtClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()=\"Button\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Right Click\"]")).click();
		Thread.sleep(2000);
		WebElement rightclick1 = driver.findElement(By.xpath("//button[@id=\"btn30\"]"));
		WebElement rightclick2 = driver.findElement(By.xpath("//button[@id=\"btn31\"]"));
		WebElement rightclick3 = driver.findElement(By.xpath("//button[@id=\"btn32\"]"));
	    
		//create object of action class
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(rightclick1).perform();
		Thread.sleep(2000);
		act.contextClick(rightclick2).perform();
		Thread.sleep(2000);
		act.contextClick(rightclick3).perform();
		driver.close();
	}
}
