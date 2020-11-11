package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductListingpage {
	public ProductListingpage(WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 }
	
		 @FindAll(@FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]"))
		 private List<WebElement> dress_List; 	
		 
		 @FindBy(how = How.XPATH, using = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
		 private WebElement image_icon;
		 
		 @FindBy(how = How.XPATH, using = "//span[contains(text(),'Add to cart')]") 
		 private WebElement btn_AddToCart;
		 
		 public void select_Product(int dressNumber) {
			 dress_List.get(dressNumber).click();
		 }
		 
		 public void Firstimage() {
			 image_icon.click();
		 }
		 
		 public void clickOn_AddToCart() {
			 btn_AddToCart.click();
		 }
		 
		

}
