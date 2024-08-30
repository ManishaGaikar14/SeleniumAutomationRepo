package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()=\"Mouse Actions\"]")).click();
		driver.findElement(By.xpath("//section[text()=\"Drag & Drop\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Drag Position\"]")).click();
		//drag element
		WebElement src = driver.findElement(By.xpath("//div[text()=\"Mobile Charger\"]"));
		WebElement src1 = driver.findElement(By.xpath("//div[text()=\"Laptop Charger\"]"));
		WebElement src2 = driver.findElement(By.xpath("//div[text()=\"Mobile Cover\"]"));
		WebElement src3 = driver.findElement(By.xpath("//div[text()=\"Laptop Cover\"]"));
		//drop element
		WebElement target = driver.findElement(By.xpath("//div[@class=\"drop-column  min-h-[200px] bg-slate-100\"]"));
		WebElement target1 = driver.findElement(By.xpath("//div[@class=\"drop-column  min-h-[200px] bg-slate-100\"]"));
		WebElement target2 = driver.findElement(By.xpath("//div[@class=\"drop-column min-h-[200px] bg-slate-100\"]"));
		WebElement target3 = driver.findElement(By.xpath("//div[@class=\"drop-column min-h-[200px] bg-slate-100\"]"));
		
		//perform drag and drop action
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		act.dragAndDrop(src, target).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src1, target1).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, target2).perform();
		Thread.sleep(2000);
		act.dragAndDrop(src3, target3).perform();
		
		driver.close();
	}
}
