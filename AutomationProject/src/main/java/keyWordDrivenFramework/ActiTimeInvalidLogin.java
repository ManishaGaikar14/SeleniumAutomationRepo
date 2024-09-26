package keyWordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Flib flib = new Flib();
		int rc = flib.rowCount("./src/main/resources/ActiTimeTestData.xlsx","Invalid Credentials");
		for(int i=1;i<=rc;i++) 
		{
			WebElement usnTB = driver.findElement(By.name("username"));
			Thread.sleep(2000);
			usnTB.sendKeys(flib.readExcelData(Excel_Path, InvalidCreds_Sheet, i, 0));
			Thread.sleep(2000);
			WebElement passTB = driver.findElement(By.name("pwd"));
			Thread.sleep(2000);
			passTB.sendKeys(flib.readExcelData(Excel_Path,InvalidCreds_Sheet,i,1));
			Thread.sleep(2000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		} 
		bt.closeBrowser();
	}
}
