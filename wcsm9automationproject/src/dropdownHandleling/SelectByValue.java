package dropdownHandleling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()=\"Dropdown\"]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"select3\"]"));
		Select sel = new Select(dropdown);
		sel.selectByValue("India");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id=\"select5\"]"));
		Select sel1 = new Select(dropdown1);
		sel1.selectByValue("Maharashtra");
		WebElement dropdown2 = driver.findElement(By.xpath("(//select[@class=\"border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150\"])[4]"));
		Select sel2 = new Select(dropdown2);
		sel2.selectByValue("Nashik");
		driver.close();
	}
}
