package popUpHandeling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()=\"Popups\"]")).click();
		driver.findElement(By.xpath("//section[text()=\"Javascript\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Prompt\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Prompt Alert Box\"]")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("yes");
		alert.accept();
		driver.close();
	}
}
