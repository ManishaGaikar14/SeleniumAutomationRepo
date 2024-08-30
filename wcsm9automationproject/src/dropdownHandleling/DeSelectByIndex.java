package dropdownHandleling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		driver.findElement(By.xpath("//section[text()=\"Dropdown\"]")).click();
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"select1\"]"));
//		Thread.sleep(2000);
//		Select sel = new Select(dropdown);
//		Thread.sleep(2000);
//		sel.selectByIndex(3);
//		Thread.sleep(2000);
//		//WebElement dropdown1 = driver.findElement(By.xpath("//select[@id=\"select1\"]"));
//		//Thread.sleep(2000);
//		//Select sel1 = new Select(dropdown1);
//		Thread.sleep(2000);
//		sel.deselectByIndex(3);
		
		//multiselect dropdown
		driver.navigate().to("file:///C:/Users/lenovo/Desktop/html%20files/mmultiselectdown.html");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
		Select sel1 = new Select(dropdown1);
		sel1.selectByIndex(2);
		Thread.sleep(2000);
		sel1.deselectByIndex(2);
	}
}
