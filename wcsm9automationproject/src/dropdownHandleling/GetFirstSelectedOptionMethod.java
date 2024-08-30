package dropdownHandleling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/lenovo/Desktop/html%20files/mmultiselectdown.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
		Thread.sleep(2000);
		Select sel = new Select(dropdown);
		sel.selectByValue("option3");
		Thread.sleep(2000);
		WebElement firstopt = sel.getFirstSelectedOption();
		System.out.println(firstopt.getText());
		
		//multi select dropdown
		
		driver.navigate().to("file:///C:/Users/lenovo/Desktop/html%20files/mmultiselectdown.html");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
		Select sel1 = new Select(dropdown1);
		for(int i=0;i<=3;i++) {
			Thread.sleep(2000);
			sel1.selectByIndex(i);
		}
		Thread.sleep(2000);
		WebElement firstoption1 = sel1.getFirstSelectedOption();
		System.out.println(firstoption1);
	
	}
}
