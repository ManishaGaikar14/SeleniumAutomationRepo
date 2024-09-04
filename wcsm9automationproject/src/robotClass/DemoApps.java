package robotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoApps {
	public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://127.0.0.1/login.do;jsessionid=65fm647qreve");
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("admin");
	Thread.sleep(2000);
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("manager");
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	robot.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	driver.switchTo().activeElement().click();
	driver.close();
	}
}
