package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnablesMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/link?sublist=0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()=\"Write a script to check button is enabled?\"]")).click();
		Thread.sleep(2000);
		boolean enable = driver.findElement(By.xpath("//button[@id=\"btn2\"]")).isEnabled();
		System.out.println(enable);
		driver.close();
	}
}
