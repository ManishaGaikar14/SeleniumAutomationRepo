package popUpHandeling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()=\"Popups\"]")).click();
		driver.findElement(By.xpath("//section[text()=\"Authentication\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Login\"]")).click();
		String ParentHandle = driver.getWindowHandle();
		Set<String> AllHandles = driver.getWindowHandles();
		for(String WH:AllHandles) {
			if(!WH.equals(ParentHandle)) {
				System.out.println(WH+" Child Handle Address");
				driver.switchTo().window(WH);
				//Alert alert = driver.switchTo().alert();
				//alert.sendKeys("admin");
				//alert.sendKeys("admin");
				//alert.accept();
			}
			else
			{
				System.out.println(WH+" Parent Handle Address");
			}
			
		}
		Thread.sleep(2000);
		handleAuthenticationPopUp();
		driver.quit();
		
	}
	public static void handleAuthenticationPopUp() throws AWTException, InterruptedException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_D);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
