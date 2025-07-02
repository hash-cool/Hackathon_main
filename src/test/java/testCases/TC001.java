package testCases;

import org.testng.Assert;
import org.testng.annotations.*;

import pageObjects.CampusCoursePage;
import pageObjects.ConfirmationPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC001 extends BaseClass{

	@Test(dataProvider="DP1", dataProviderClass=DataProviders.class)
	public void fill_details(String fname, String lname, String workmail, String phone, String instType, String instName, String jobRole, String department, String descp, String country, String state)
	{
		logger.info("***** Strarting TC *****");
		logger.debug("***** This is Debug Log ****");
		try {
			
			CampusCoursePage campusCoursePage=new CampusCoursePage();
			
			campusCoursePage.scrollToForm();
			campusCoursePage.setFirstName(fname);
			campusCoursePage.setLastName(lname);
			campusCoursePage.setEmail(workmail);
			campusCoursePage.setPhoneNumber(phone);
			campusCoursePage.setInstitutionName(instName);
			campusCoursePage.selectInstitutionType(instType);
			campusCoursePage.selectJobRole(jobRole);
			campusCoursePage.selectDepartment(department);
			campusCoursePage.selectNeeds(descp);
			campusCoursePage.selectCountry(country);
			campusCoursePage.selectState(state);
			campusCoursePage.clickSubmitBtn();
			
			Assert.assertEquals(new ConfirmationPage().confirmMsg.getText(), "Thank you for your interest in Coursera for Campus");
			logger.info("***** TC Passed *****");
		}
		catch(Exception e)
		{
			logger.error("Test failed: "+e.getMessage());
			Assert.fail("Test failed: "+e.getMessage());
		}
		finally
		{
			logger.info("***** Finished TC *****");
		}
		
//		Thank you for your interest in Coursera for Campus
		
	}
}
