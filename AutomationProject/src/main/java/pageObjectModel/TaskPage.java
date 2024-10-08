package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	//store all the WebElements of TaskPage
	@FindBy(partialLinkText = "Projects & Customers") private WebElement ProjectAndCutomer;
	@FindBy(xpath = "//input[@value=\"Create New Customer\"]") private WebElement CreateNewCustomer;
	@FindBy(xpath = "//input[@name=\"name\"]") private WebElement CustomerName;
	@FindBy(xpath = "//textarea[@name=\"description\"]") private WebElement CustomerDescription;
	@FindBy(xpath = "//input[@name=\"createCustomerSubmit\"]") private WebElement CreateCustomerButton;
		
	@FindBy(xpath = "//input[@value=\"Create New Customer\"]") private WebElement CreateNewProject;
	@FindBy(xpath = "//select[@name=\"customerId\"]") private WebElement CustomerDropDown;
	@FindBy(xpath = "//input[@name=\"name\"]") private WebElement ProjectName;
	@FindBy(xpath = "//textarea[@name=\"description\"]") private WebElement ProjectDiscription;
	@FindBy(xpath = "//input[@type=\"submit\"]") private WebElement CreateProjectButtom;
	
	@FindBy(xpath = "//select[@name=\"selectedCustomer\"]") private WebElement SelectCustomerDropDown;
	
	//initialization
	public TaskPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utilization
	public WebElement getProjectAndCutomer() {
		return ProjectAndCutomer;
	}

	public WebElement getCreateNewCustomer() {
		return CreateNewCustomer;
	}

	public WebElement getCustomerName() {
		return CustomerName;
	}

	public WebElement getCustomerDescription() {
		return CustomerDescription;
	}

	public WebElement getCreateCustomerButton() {
		return CreateCustomerButton;
	}

	public WebElement getCreateNewProject() {
		return CreateNewProject;
	}

	public WebElement getCustomerDropDown() {
		return CustomerDropDown;
	}

	public WebElement getProjectName() {
		return ProjectName;
	}

	public WebElement getProjectDiscription() {
		return ProjectDiscription;
	}

	public WebElement getCreateProjectButtom() {
		return CreateProjectButtom;
	}

	public WebElement getSelectCustomerDropDown() {
		return SelectCustomerDropDown;
	}
	
	//operational methods
	
	public void createCustomer_createProject(String Customer_Name,String Customer_Description,String Project_Name,String Project_Description) throws InterruptedException {
		 ProjectAndCutomer.click();
		 Thread.sleep(2000);
		 CreateNewCustomer.click();
		 Thread.sleep(2000);
		 CustomerName.sendKeys(Customer_Name);
		 Thread.sleep(2000);
		 CustomerDescription.sendKeys(Customer_Description);
		 Thread.sleep(2000);
		 CreateCustomerButton.click();
		 Thread.sleep(2000);
		 CreateNewProject.click();
		 Thread.sleep(2000);
		 CustomerDropDown.click();
		 Thread.sleep(2000);
		 ProjectName.sendKeys(Project_Name);
		 Thread.sleep(2000);
		 ProjectDiscription.sendKeys(Project_Description);
		 Thread.sleep(2000);
		 CreateProjectButtom.click();
		 Thread.sleep(2000);
		 SelectCustomerDropDown.click();

   }
}