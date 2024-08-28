package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Manisha Gaikar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"name\"]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("manisha@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
		Thread.sleep(2000);
		driver.close();
	}
}
