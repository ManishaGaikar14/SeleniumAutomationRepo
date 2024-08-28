package xPathUsingAxes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.myntra.com/");
		String FirstHandle = driver.getTitle();
		System.out.println(FirstHandle);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,\"Search for products,\")]")).sendKeys("radha krishna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-reactid=\"909\"]")).click();
		Thread.sleep(2000);
		String SecondHandle = driver.getTitle();
		System.out.println(SecondHandle);
		driver.findElement(By.xpath("//input[@type=\"radio\" and (@value=\"girls,boys girls\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"checkbox\" and (@value=\"Lehenga Choli\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"checkbox\" and (@class=\"price-input\") and (@value=\"599.0 TO 757.0\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[@class=\"common-customCheckbox\" and (@data-count=\"1\")])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class=\"img-responsive\"]")).click();
		Thread.sleep(2000);	
		//driver.findElement(By.xpath("(//span[@class=\"size-buttons-size-strike-hide\"])[1]")).click();
	}
}
