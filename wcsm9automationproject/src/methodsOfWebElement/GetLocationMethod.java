package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/table?scenario=1");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//section[text()=\"Button\"]"));
		Point loc = button.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		System.out.println("location of given element "+xaxis+":"+yaxis);
		Thread.sleep(2000);
		//Point location1 = driver.findElement(By.xpath("(//td[@class=\"px-6 py-4\"])[11]")).getLocation();
		//System.out.println(location1);
		driver.close();
	}
}
