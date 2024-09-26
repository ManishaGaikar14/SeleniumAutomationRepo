package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		bt.openBrowser();
		Thread.sleep(2000);
		WebElement usnTB = driver.findElement(By.name("username"));
		Thread.sleep(2000);
		usnTB.sendKeys(flib.readDataFromProperty(Prop_Path, "Username"));
		Thread.sleep(2000);
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		Thread.sleep(2000);
		pwdTB.sendKeys(flib.readDataFromProperty(Prop_Path, "Password"));
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		bt.closeBrowser();
	}
}
