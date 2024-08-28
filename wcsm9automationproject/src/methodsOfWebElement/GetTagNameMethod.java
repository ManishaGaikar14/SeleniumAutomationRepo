package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(2000);
		WebElement text = driver.findElement(By.xpath("//section[text()=\"Button\"]"));
		text.click();
		String tagname = text.getTagName();
		System.out.println(tagname);
		driver.close();
	}
}
