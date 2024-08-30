package dropdownHandleling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/lenovo/Desktop/html%20files/mmultiselectdown.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
		Select sel = new Select(dropdown);
		WebElement allopt = sel.getWrappedElement();
		System.out.println(allopt.getText());
		//get all the options from dropdown by using getoption
		List<WebElement> options = sel.getOptions();
		//select the option from dropdown using selection mwthod
		for(WebElement opt:options){
			Thread.sleep(2000);
			if(opt.getText().equals("Option 3")) {
				opt.click();
				break;
			}
		}
	driver.close();
	}
}
