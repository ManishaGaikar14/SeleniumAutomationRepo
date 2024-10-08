package pageObjectModel;

import java.io.IOException;

public class CreateCustomer_Project extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		//opem and close browser
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//read the data from property and excel file
		Flib flib = new Flib();
		//to perform Valid login use login page POM
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readDataFromProperty(Prop_Path,"Username"),flib.readDataFromProperty(Prop_Path, "Password"));
		Thread.sleep(2000);
		//to work task module use HomePage POM
		HomePage hp = new HomePage(driver);
		hp.click_on_Tasks();
		Thread.sleep(2000);
		//to create cutomer and project use TaskPage pom
	
		TaskPage tp = new TaskPage(driver);
		tp.createCustomer_createProject(flib.readDataFromExcel(Excel_Path, Customer_Proj_Sheet, 1, 0),flib.readDataFromExcel(Excel_Path, Customer_Proj_Sheet, 1, 1),flib.readDataFromExcel(Excel_Path, Customer_Proj_Sheet, 1, 2),flib.readDataFromExcel(Excel_Path, Customer_Proj_Sheet, 1,3));
		Thread.sleep(2000);
		bt.tearDown();
	}
}
