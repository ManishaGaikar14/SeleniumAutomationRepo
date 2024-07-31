package methodsOfWebDriver;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Thread.sleep(2000);
		String ParentHandle = driver.getWindowHandle();
		System.out.println(ParentHandle);
		Thread.sleep(2000);
		//click on open a pup up window
		driver.findElement(By.partialLinkText("Open a popup")).click();
		Set<String> AllHandles = driver.getWindowHandles();
		for(String WH:AllHandles) {
			if (!ParentHandle.equals(WH)) {
				System.out.println("Address Of The Child Handle : "+WH);
				Thread.sleep(2000);
				TargetLocator switchTo = driver.switchTo();
				switchTo.window(WH).manage().window().maximize();
				Thread.sleep(2000);
				switchTo.window(WH).close();
			}
			else
			{
				System.out.println("Address Of Parent Window : "+WH);
			}
		}
	}

}
