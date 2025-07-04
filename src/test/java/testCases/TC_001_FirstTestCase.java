
package testCases;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjects.AvailCourses;
import pageObjects.HomePage;
import testBase.BaseClass;



public class TC_001_FirstTestCase extends BaseClass{
	
	@Test
	public void searchCourse(){
		try {
			//Home page

			logger.info("***** Starting TC001 *****");
			HomePage hm = new HomePage(driver);
			hm.sendingKeys(prop.getProperty("course"));
			hm.click();
			
			//AvailCourses 
			AvailCourses avc = new AvailCourses(driver);
			avc.clickEnglishCheckbox();
			avc.clickLevelCheckbox();
			
			//Avail course first course
			String a1 = avc.firstCourseTitle();
			String a2 = avc.firstCourseRating();
			String a3 = avc.firstCourseDuration();
			System.out.println(a1+" "+a2+" "+a3);
					
			//Avail course second course
			String b1 = avc.secondCourseTitle();
			String b2 = avc.secondCourseRating();
			String b3 = avc.secondCourseDuration();
			System.out.println(b1+" "+b2+" "+b3);
			
			// unchecking the options
			avc.clickEnglishCheckbox();
			avc.clickLevelCheckbox();
			
			// Showing 8 more 
			avc.clickShow8More();
			
			// language learning checking
			avc.clickLanguageLearning();
			
			// Showing 21 more
			avc.clickShow21More();
			
			//languages via list
			List<WebElement> languageWithCount = avc.languages();
			for(WebElement ele:languageWithCount) {
				System.out.println(ele.getText());
			}
			
			//levels via list
			List<WebElement> levelWithCount = avc.levels();
			for(WebElement ele:levelWithCount) {
				System.out.println(ele.getText());
			}
			
			//Returning back to home page(Coursera)
			hm.clickHome();
			
//			Assert.assertTrue(true);
			SoftAssert sa=new SoftAssert();
			sa.assertTrue(true);
//			sa.assertAll();
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
}
