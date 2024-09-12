package popUpHandeling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Popups\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Javascript\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()=\"Write a script to handle alert popup ?\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"buttonAlert2\"]")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		//alert.sendKeys("manu");
		alert.dismiss();
		driver.close();
	}
}
