package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/b?node=14605651031");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"twotabsearchtextbox\"]")).sendKeys("laptop");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
	}
}
