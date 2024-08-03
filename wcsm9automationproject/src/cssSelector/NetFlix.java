package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlix {
	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  driver.get("https://www.netflix.com/in/");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("input[id=\":r0:\"]")).sendKeys("poojagaikar@gmail.com");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[data-uia=\"nmhp-card-cta+hero_fuji\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[data-uia=\"cta-continue-registration\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("label[for=\"id_password\"]")).sendKeys("Pooja@14");
	  Thread.sleep(2000);
	  driver.findElement(By.cssSelector("button[placeholder=\"regForm_button_next\"]")).click();
	}
}
