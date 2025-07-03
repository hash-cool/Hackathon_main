package pageObjects;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CampusCoursePage extends BaseClass {
	
	
	//Constructor
	public CampusCoursePage(WebDriver driver) {
		super(driver);
	}
	
	// locators for course form
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement txtFirstName;
	
	@FindBy(id="LastName")
	WebElement txtLastName;
	
	@FindBy(id="Email")
	WebElement txtEmail;
	
	@FindBy(id="Phone")
	WebElement txtPhone;
	
	@FindBy(id="Institution_Type__c")
	WebElement drpdnInstitutionType;
	
	@FindBy(id="Company")
	WebElement txtInstitutionName;
	
	@FindBy(id="Title")
	WebElement drpdnJobRole;
	
	@FindBy(id="Department")
	WebElement drpdnDepartment;
	
	@FindBy(id="What_the_lead_asked_for_on_the_website__c")
	WebElement drpdnDescribeNeeds;
	
	@FindBy(id="Self_reported_employees_to_buy_for__c")
	WebElement drpdnNoOfLearners;
	
	@FindBy(id="Country")
	WebElement drpdnCountry;
	
	@FindBy(id="State")
	WebElement drpdnState;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//div[@class='css-3o18c4']")
	WebElement elmtForm;
	
	
	//Method to scroll to form 

	public void scrollToForm() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",elmtForm);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	// Methods for filling the form
	public void setFirstName(String firstName) {
		txtFirstName.sendKeys(firstName);
	}
	
	public void setLastName(String lastName) {
		txtLastName.sendKeys(lastName);
	}
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPhoneNumber(String phnNumber) {
		txtPhone.sendKeys(phnNumber);
	}
	
	public void selectInstitutionType(String institutionType) {
		Select select=new Select(drpdnInstitutionType);
		select.selectByVisibleText(institutionType);
	}
	
	public void setInstitutionName(String institutionName) {
		txtInstitutionName.sendKeys(institutionName);
	}
	
	public void selectJobRole(String jobRole) {
		Select select=new Select(drpdnJobRole);
		select.selectByVisibleText(jobRole);
	}
	
	public void selectDepartment(String department) {
		Select select=new Select(drpdnDepartment);
		select.selectByVisibleText(department);
	}
	
	public void selectNeeds(String needs) {
		Select select=new Select(drpdnDescribeNeeds);
		select.selectByVisibleText(needs);
	}
	
	public void selectNoOfLearners(String learners) {
		Select select=new Select(drpdnNoOfLearners);
		select.selectByVisibleText(learners);
	}
	
	public void selectCountry(String country) {
		Select select=new Select(drpdnCountry);
		select.selectByVisibleText(country);
	}
	
	public void selectState(String state) {
		Select select=new Select(drpdnState);
		select.selectByVisibleText(state);
	}
	public void clickSubmitBtn() {
		btnSubmit.click();
	}
	

}
