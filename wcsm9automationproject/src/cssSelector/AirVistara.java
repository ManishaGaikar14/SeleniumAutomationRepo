package cssSelector;

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
		driver.findElement(By.cssSelector("input[name=\"flightSearchFrom\"]")).sendKeys("KFDG");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"flightSearchTo\"]")).sendKeys("MNVC");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"departCalendar\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[monthname=\"Nov\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-date=\"14\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[data-date=\"15\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id=\"adds_adult\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id=\"adds_child\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id=\"adds_infant\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[value=\"business\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[class=\"col-xs-12 done_btn aubergine-button-dark passengerModalBtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id=\"book-flight-widget\"]")).click();
		driver.close();
	}
}
