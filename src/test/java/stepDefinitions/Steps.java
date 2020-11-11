package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataProvider.configFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.Checkoutpage;
import pageObjects.Homepage;
import pageObjects.ProductListingpage;

public class Steps {
	WebDriver driver;
	
	
	@Given("^User is in Homepage$")
	public void user_is_in_Homepage() throws Throwable {
		configFileReader ConfigFileReader = new configFileReader();
		System.setProperty("webdriver.chrome.driver",ConfigFileReader.getDriverPath());
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(ConfigFileReader.getImplicitlyWait(), TimeUnit.SECONDS);
		 driver.get("http://automationpractice.com");
	}

	@When("^User search for \"([^\"]*)\"$")
	public void user_search_for(String arg1) throws Throwable {
		Homepage home = new Homepage(driver);
		 home.perform_Search(arg1);
	}

	@When("^choose to buy the first item$")
	public void choose_to_buy_the_first_item() throws Throwable {
		ProductListingpage productListingPage = new ProductListingpage(driver);
		 productListingPage.select_Product(0);
		 productListingPage.clickOn_AddToCart();
	}

	@When("^add the item to cart for checkout$")
	public void add_the_item_to_cart_for_checkout() throws Throwable {
		Checkoutpage checkoutPage = new Checkoutpage(driver);
		 checkoutPage.click_checkout1();
		 checkoutPage.click_checkout2();
	}

	@When("^create an account$")
	public void create_an_account() throws Throwable {
		Checkoutpage checkoutPage = new Checkoutpage(driver);
		 checkoutPage.Enter_emailAddress(); 
		 checkoutPage.click_createaccount();
	}

	@When("^enter the personal details to register$")
	public void enter_the_personal_details_to_register() throws Throwable {
	     Thread.sleep(5000);
	     Checkoutpage checkoutPage = new Checkoutpage(driver);
	     checkoutPage.click_title();
	     checkoutPage.fill_PersonalDetails();
	     checkoutPage.click_Register();
	}

	@When("^select the same delivery address$")
	public void select_the_same_delivery_address() throws Throwable {
	     Thread.sleep(2000);
	     Checkoutpage checkoutPage = new Checkoutpage(driver);
	     checkoutPage.click_checkout3();
	}

	@When("^accept the terms & conditions$")
	public void accept_the_terms_conditions() throws Throwable {
	     Thread.sleep(3000);
	     Checkoutpage checkoutPage = new Checkoutpage(driver);
	     checkoutPage.check_TermsAndCondition(true);
	     checkoutPage.click_checkout4();
	}

	@When("^select the payment method as Bank Wire$")
	public void select_the_payment_method_as(String arg1) throws Throwable {
		 Checkoutpage checkoutPage = new Checkoutpage(driver);
	     checkoutPage.select_PaymentMethod();
		 Thread.sleep(2000);
	}

	@When("^place the order$")
	public void place_the_order() throws Throwable {
		 Checkoutpage checkoutPage = new Checkoutpage(driver);
	     checkoutPage.click_confirmOrder();
	}
	
}
