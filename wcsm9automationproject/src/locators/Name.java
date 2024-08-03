package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/lenovo/Desktop/html%20files/textBar.html");
		Thread.sleep(2000);
		driver.findElement(By.name("name1")).sendKeys("manu1234");
		Thread.sleep(2000);
		driver.close();
	}
}
