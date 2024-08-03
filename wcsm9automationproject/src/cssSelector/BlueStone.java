package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id=\"denyBtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"search_query_top_elastic_search\"]")).sendKeys("coins");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"submit_search\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[data-name=\"rs 10000 to 20000\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"getNearestStore\"]")).sendKeys("422403");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("h4[id=\"customizeOptionForEventLogger\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("input[id=\"metalPurity_18\"]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"Submit\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("select[name=\"17101518\"]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[class=\"fancybox-popup-style-5\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name=\"giftTo\"]")).sendKeys("Manu");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"giftFrom\"]")).sendKeys("puja");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("textarea[name=\"giftMsg\"]")).sendKeys("Happy Birthday My Dear Freind");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span[id=\"save_gift_message\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[title=\"Place Order\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"email\"]")).sendKeys("manipuja12@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"contactNumber\"]")).sendKeys("7983476934");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
		driver.close();
	}
}
