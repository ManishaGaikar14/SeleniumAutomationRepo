package popUpHandeling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Popups\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Notifications\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()=\"Notification\"]")).click();
		Thread.sleep(2000);
		Alert confirm = driver.switchTo().alert();
		Thread.sleep(2000);
		confirm.dismiss();
		driver.close();
	}
}
