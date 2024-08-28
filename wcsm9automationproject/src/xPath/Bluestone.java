package xPath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id=\"denyBtn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"search_query_top_elastic_search\"]")).sendKeys("Rings");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name=\"rs 0 to 10000\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-tagcategory=\"Gender\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-name=\"diamond\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@onclick=\"triggerPLinkClick(event);trackGA( 'BsUI',  'ClickedHoverImage-ProductHover',  '64264');\"]")).click();
		Thread.sleep(2000);
		String ParentHnadle = driver.getWindowHandle();
		System.out.println(ParentHnadle);
		Set<String> AllHandles = driver.getWindowHandles();
		System.out.println(AllHandles);
		for(String WH:AllHandles) {
			if (!ParentHnadle.equals(WH)) {
				System.out.println("Address Of Child Window"+WH);
				Thread.sleep(2000);
				TargetLocator switchtoo = driver.switchTo();
				WebDriver newWindow = switchtoo.window(WH);
				newWindow.manage().window().maximize();
				//newWindow.close();
			}
			else 
			{
				System.out.println("Address Of Parent Window"+WH);
			}
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"Pincode\"]")).sendKeys("432222");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Update\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Customize this design\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()=\" SI IJ\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"buy-now\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class=\"cs gift-icon\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"giftTo\"]")).sendKeys("komal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"giftFrom\"]")).sendKeys("Kajal");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id=\"giftMsg\"]")).sendKeys("Happiest Birthday My Dear Frnd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id=\"save_gift_message\"]")).click();
		Thread.sleep(2000);
		driver.close();
	}
}
