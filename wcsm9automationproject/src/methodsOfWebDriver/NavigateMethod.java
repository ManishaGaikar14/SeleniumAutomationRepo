package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//to launch application we can use navigation method
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		//click on pop up window
		driver.findElement(By.linkText("Downloads")).click();
		Thread.sleep(2000);
		//to backword page
		driver.navigate().back();
		Thread.sleep(2000);
		//to refresh page
		driver.navigate().refresh();
		Thread.sleep(2000);
		//to forword page
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
	}
}
