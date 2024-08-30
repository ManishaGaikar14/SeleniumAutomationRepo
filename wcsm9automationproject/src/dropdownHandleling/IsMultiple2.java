package dropdownHandleling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()=\"Dropdown\"]")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"select1\"]"));
		Select sel = new Select(dropdown);
		Thread.sleep(2000);
		boolean status = sel.isMultiple();
		Thread.sleep(2000);
		System.out.println(status);
		
		//multi select dropdown
		driver.findElement(By.xpath("//a[text()=\"Multi Select\"]")).click();
		Thread.sleep(2000);
		WebElement dropdown1 = driver.findElement(By.xpath("(//select[@id=\"select-multiple-native\"])[2]"));
		Select sel1 = new Select(dropdown1);
		Thread.sleep(2000);
		boolean status1 = sel1.isMultiple();
		System.out.println(status1);
		driver.close();
	}
}
