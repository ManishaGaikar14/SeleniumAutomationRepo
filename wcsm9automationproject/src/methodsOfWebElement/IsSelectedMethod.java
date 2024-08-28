package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://omayo.blogspot.com/");
		 Thread.sleep(2000);
		 boolean selected = driver.findElement(By.xpath("//option[@value=\"Hyundaix\"]")).isSelected();
		 System.out.println(selected);
		 driver.close();
	}
}
