package javaScriptExecutor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class HandleDisableWebElement {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://omayo.blogspot.com/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		WebElement disablebutton = driver.findElement(By.xpath("//button[@id=\"but1\"]"));
		//Point loc = disablebutton.getLocation();
		//int xaxis = loc.getX();
		//int yaxis = loc.getY();
		//jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-40)+")");
		Thread.sleep(2000);
		jse.executeScript("arguments[0].click();",disablebutton);
		Thread.sleep(2000);
		File src = disablebutton.getScreenshotAs(OutputType.FILE);
		File desc = new File("./ScreenShots/handleDisableElement.png");
		Files.copy(src, desc);	
	}
}
