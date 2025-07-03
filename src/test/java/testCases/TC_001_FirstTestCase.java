package testCases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AvailCourses;
import pageObjects.HomePage;



public class TC_001_FirstTestCase extends BaseClass{
	
	@Test
	public void searchCourse(){
		try {
			//Home page
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
					
			//Avail course second course
			String b1 = avc.secondCourseTitle();
			String b2 = avc.secondCourseRating();
			String b3 = avc.secondCourseDuration();
			
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
			
			//levels via list
			List<WebElement> levelWithCount = avc.levels();
			
			//Returning back to home page(Coursera)
			hm.clickHome();
			Assert.assertTrue(true);
			
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
}
