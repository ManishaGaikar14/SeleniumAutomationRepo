package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.selenium.dev/");
		String handleAdd = driver.getWindowHandle();
		System.out.println("Address Of Parent Window = "+handleAdd);
		driver.close();
	}
}
