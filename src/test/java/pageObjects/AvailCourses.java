package pageObjects;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class secondpage extends firstpage{
	WebDriver driver;
	
	public secondpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"cds-react-aria-:Rhlbdj2tacqkqikta:\"]")
	WebElement english_checkbox;
	
	@FindBy(xpath="//span[text()='Beginner']")
	WebElement beginner_checkbox;
	
	//First Product
	@FindBy(xpath="//*[@id='cds-react-aria-:R58d5iv6laikta:-product-card-title']")
	WebElement first_course;
	
	@FindBy(xpath="//div[@id='cds-react-aria-:R5pfd8d5iv6laikta:-meter']/span")
	WebElement first_course_rating;
	
	@FindBy(xpath="//ul[@class='cds-9 css-5t8l4v cds-10']/li[1]/div//div[@class='cds-ProductCard-footer']/div[@class='cds-CommonCard-metadata']/p")
	WebElement first_course_duration;
	
	//Second Product
	
	@FindBy(xpath="//*[@id='cds-react-aria-:R58l5iv6laikta:-product-card-title']")
	WebElement second_course;
	
	@FindBy(xpath="//div[@id='cds-react-aria-:R5pfd8l5iv6laikta:-meter']/span")
	WebElement second_course_rating;
	
	@FindBy(xpath="//ul[@class='cds-9 css-5t8l4v cds-10']/li[2]/div//div[@class='cds-ProductCard-footer']/div[@class='cds-CommonCard-metadata']/p")
	WebElement second_course_duration;
	
	@FindBy(xpath="//span[text() = 'Language Learning']")
	WebElement lang_checkbox;
	
	@FindBy(xpath="//span[text()='Show 8 more']")
	WebElement show_8_more;
	
	@FindBy(xpath="//span[text()='Show 21 more']")
	WebElement show_21_more;
	
	public void clickEnglishCheckbox() {
		english_checkbox.click();
	}
	public void clickLevelCheckbox() {
		beginner_checkbox.click();
	}
	
	public String firstCourseTitle() {
		return first_course.getText();
	}
	public String firstCourseRating() {
		return first_course_rating.getText();
	}
	public String firstCourseDuration() {
		return first_course_duration.getText();
	}
	
	public String secondCourseTitle() {
		return second_course.getText();
	}
	public String secondCourseRating() {
		return second_course_rating.getText();
	}
	public String secondCourseDuration() {
		return second_course_duration.getText();
	}
	public void clickShow8More() {
		show_8_more.click();
	}
	public void clickLanguageLearning() {
		lang_checkbox.click();
	}
	public void clickShow21More() {
		show_21_more.click();
	}
	public List<WebElement> languages(){
		List<WebElement> language_list = driver.findElements(By.xpath("//div[@id='cds-react-aria-:R13dj2tacqkqikta:']/following-sibling::div"));
		return language_list;
	}
	public List<WebElement> levels(){
		List<WebElement> level_list = driver.findElements(By.xpath("//div[@data-testid='search-filter-group-Level']//div[@class='cds-176 cds-formGroup-groupWrapper']"));
		return level_list;
	}
}
