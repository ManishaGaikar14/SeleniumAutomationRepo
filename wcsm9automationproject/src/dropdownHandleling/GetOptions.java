package dropdownHandleling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()=\"Dropdown\"]")).click();
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"select1\"]"));
		Select sel = new Select(dropdown);
		List<WebElement> listofwebEle = sel.getOptions();
		System.out.println(listofwebEle);
		for(WebElement op:listofwebEle) {
			String opt1 = op.getText();
			Thread.sleep(2000);
			System.out.println(opt1);
		}
		driver.close();
	}
}
