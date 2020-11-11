package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
	 
	 public Homepage(WebDriver driver) {
	 this.driver = driver;
	 PageFactory.initElements(driver, this);
	 }
	 
	 public void navigateTo_HomePage() {
		 driver.get("http://automationpractice.com");
	 }
	 
	 public void perform_Search(String search) {
	 driver.navigate().to("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=\"+ arg1 +\"&submit_search=");
	 }
	 
	 
}
