package assignments;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazone {
	static WebDriver driver;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pass the browser name which you want to launch");
		String browservalue = sc.next();
		if (browservalue.equalsIgnoreCase("chrome"))
		{	
			driver=new ChromeDriver();
		}
		else if (browservalue.equalsIgnoreCase("firefox"))
		{		
			driver=new FirefoxDriver();	
		}
		else if(browservalue.equalsIgnoreCase("edge"))
		{	
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("this is not browser value");
		}
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.amazon.in/");
		 searchproduct("Apple Watches");
	}
		public static void searchproduct(String product) {
		 WebElement searchbox = driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"));
		 searchbox.sendKeys(product);
		 driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		 driver.findElement(By.xpath("(//img[@data-image-latency=\"s-product-image\"])[1]")).click();
		 //driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();
		 }
}
