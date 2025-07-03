import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
 
public class HomePageCourse extends BaseClass  {
   
	//3locators 2 methods
	 public HomePageCourse(WebDriver driver) {
		 super(driver);
	 }
	 @FindBy(xpath="//input[@id=\"search-autocomplete-input\"]")
	 WebElement search;
	
	 @FindBy(xpath="//button[@class=\"nostyle search-button\"][1]")
	 WebElement searchbutton;
	 public void sendingKeys() {
		 search.sendKeys("Web Development");
	 }
	 public void click() {
		 searchbutton.click();
	 }
	
}