package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import testBase.BaseClass;

public class CampusCoursePage extends BaseClass {
	
	// locators for course form
	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement txtFirstName;

	@FindBy(id = "LastName")
	WebElement txtLastName;

	@FindBy(id = "Email")
	WebElement txtEmail;

	@FindBy(id = "Phone")
	WebElement txtPhone;

	@FindBy(id = "Institution_Type__c")
	WebElement drpdnInstitutionType;

	@FindBy(id = "Company")
	WebElement txtInstitutionName;

	@FindBy(id = "Title")
	WebElement drpdnJobRole;

	@FindBy(id = "Department")
	WebElement drpdnDepartment;

	@FindBy(id = "What_the_lead_asked_for_on_the_website__c")
	WebElement drpdnDescribeNeeds;

	@FindBy(id = "Self_reported_employees_to_buy_for__c")
	WebElement drpdnNoOfLearners;

	@FindBy(id = "Country")
	WebElement drpdnCountry;

	@FindBy(id = "State")
	WebElement drpdnState;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement btnSubmit;

	@FindBy(xpath = "//div[@class='css-3o18c4']")
	WebElement elmtForm;

	// Method to scroll to form

	public void scrollToForm() {
		jsScrollIntoView(elmtForm);
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

	public void setInstitutionName(String institutionName) {
		txtInstitutionName.sendKeys(institutionName);
	}

	public void selectInstitutionType(String institutionType) {
		selectElementsByVisibleText(drpdnInstitutionType, institutionType);
	}

	public void selectJobRole(String jobRole) {
		selectElementsByVisibleText(drpdnJobRole, jobRole);
	}

	public void selectDepartment(String department) {
		selectElementsByVisibleText(drpdnDepartment, department);
	}

	public void selectNeeds(String needs) {
		selectElementsByVisibleText(drpdnDescribeNeeds, needs);
	}

	public void selectCountry(String country) {
		selectElementsByVisibleText(drpdnCountry, country);
	}

	public void selectState(String state) {
		selectElementsByVisibleText(drpdnState, state);
	}

	public void clickSubmitBtn() {
		btnSubmit.click();
	}

}
