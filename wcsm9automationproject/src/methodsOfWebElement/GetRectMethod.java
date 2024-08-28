package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do");
		WebElement area = driver.findElement(By.xpath("//table[@class=\"mainArea\"]"));
		Rectangle sizelocation = area.getRect();
		System.out.println("height "+sizelocation.getHeight());
		System.out.println("width "+sizelocation.getWidth());
		System.out.println("xaxis "+sizelocation.getX());
		System.out.println("yaxis "+sizelocation.getY());
		System.out.println("point "+sizelocation.getPoint());
		System.out.println(sizelocation);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name=\"pwd\"]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id=\"loginButton\"]")).click();
		driver.close();
	}
}
