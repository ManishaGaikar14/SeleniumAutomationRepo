package popUpHandeling;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NootificaationPopUp {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
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
		driver.close();
	}

}
