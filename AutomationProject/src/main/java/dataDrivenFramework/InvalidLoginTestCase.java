package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://127.0.0.1/login.do");
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx","Invalid Credentials");
	
		for(int i=1;i<=rc;i++) {
			String usnData = flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx","Invalid Credentials", i,0);
			Thread.sleep(2000);
			String pwdData = flib.readExcelData("./src/main/resources/ActiTimeTestData.xlsx","Invalid Credentials", i,1);
			Thread.sleep(2000);
			driver.findElement(By.name("username")).sendKeys(usnData);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(pwdData);
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();	
		}
		
		driver.close();
	}
}
