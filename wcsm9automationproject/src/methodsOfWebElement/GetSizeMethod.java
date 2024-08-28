package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
		Thread.sleep(2000);
		Dimension sizewebelement = driver.findElement(By.xpath("//table[@class=\"mainArea\"]")).getSize();
		int hight = sizewebelement.getHeight();
		int width = sizewebelement.getWidth();
		System.out.println("hight of web element "+hight);
		System.out.println("width of web element "+width);
		System.out.println(sizewebelement);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
