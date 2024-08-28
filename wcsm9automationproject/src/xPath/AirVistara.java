package xPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"flightSearchFrom\"]")).sendKeys("GHAR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"flightSearchTo\"]")).sendKeys("STATION");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"departCalendar\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@monthname=\"Dec\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-date=\"24\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-date=\"28\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"adds_adult\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"adds_child\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"adds_infant\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value=\"business\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"col-xs-12 done_btn aubergine-button-dark passengerModalBtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id=\"book-flight-widget\"]")).click();
		driver.quit();
		
	}
}
