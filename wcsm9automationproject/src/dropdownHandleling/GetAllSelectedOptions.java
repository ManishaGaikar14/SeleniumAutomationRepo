package dropdownHandleling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/lenovo/Desktop/html%20files/mmultiselectdown.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
		Select sel = new Select(dropdown);
		for(int i=0;i<=3;i++) {
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		List<WebElement> AllOpt = sel.getAllSelectedOptions();
		for(int i=0;i<=AllOpt.size();i++) {
			Thread.sleep(2000);
			String opt = AllOpt.get(i).getText();
			System.out.println(opt);
		}
	}
}
