package pageObjects;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Checkoutpage {
	 
	 public Checkoutpage(WebDriver driver) {
	     PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(how =How.XPATH, using = "//header/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]")
	 private WebElement btn_PrtoCout1;
	 
	 @FindBy(how =How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]")
	 private WebElement btn_PrtoCout2;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='email_create']")
	 private WebElement txtbx_email;
	 
	 @FindBy(how =How.XPATH, using = "//button[@id='SubmitCreate']")
	 private WebElement btn_createAC;
	 
	 @FindBy(how = How.CSS, using = "#id_gender2") 
	 private WebElement chkbx_Title;
	 
	 @FindBy(how = How.XPATH, using = "#customer_firstname") 
	 private WebElement txtbx_FirstName;
	 
	 @FindBy(how = How.CSS, using = "#customer_lastname") 
	 private WebElement txtbx_LastName;
	 
	 @FindBy(how = How.CSS, using = "#passwd") 
	 private WebElement txtbx_Password;
	 
	 @FindBy(how = How.CSS, using = "#address1") 
	 private WebElement txtbx_Address;
	 
	 @FindBy(how = How.CSS, using = "#city") 
	 private WebElement txtbx_City;
	 
	 @FindBy(how = How.CSS, using = "#id_state") 
	 private WebElement drpdwn_State;
	 
	 @FindAll(@FindBy(how = How.CSS, using = "#id_state"))
	 private List<WebElement> state_List;
	 
	 @FindBy(how = How.CSS, using = "#postcode") 
	 private WebElement txtbx_PostCode;
	 
	 @FindBy(how = How.CSS, using = "#phone_mobile") 
	 private WebElement txtbx_Phone;
	 
	 @FindBy(how = How.CSS, using = "#submitAccount")
	 private WebElement btn_Register;
	 
	 @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]")
	 private WebElement btn_PrtoCout3;
	 
	 @FindBy(how = How.XPATH, using = "//input[@id='cgv']") 
	 private WebElement chkbx_AcceptTandC;
	 
	 @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]")
	 private WebElement btn_PrtoCout4;
	 
	 @FindAll(@FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/p[1]/a[1]"))
	 private WebElement paymentMethod_bankwire; 
	 
	 @FindBy(how = How.XPATH, using = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]") 
	 private WebElement btn_ConfirmOrder;
	 
	 public void click_checkout1() {
		 btn_PrtoCout1.click();
	 }
	 public void click_checkout2() {
		 btn_PrtoCout2.click();
	 }
	 
	 public void enter_Email(String email) {
		 txtbx_email.sendKeys(email);
	 }
	 
	 public void click_createaccount() {
		 btn_createAC.click();
	 }
	 
	 public void click_title() {
		 chkbx_Title.click();
	 }
	 
	 public void enter_FirstName(String name) {
	 txtbx_FirstName.sendKeys(name);
	 }
	 
	 public void enter_LastName(String lastName) {
	 txtbx_LastName.sendKeys(lastName);
	 }
	 
	 public void enter_Password(String password) {
		 txtbx_Password.sendKeys(password);
	 }
	 
	 public void enter_Address(String address) {
		 txtbx_Address.sendKeys(address);
	 }
	 
	 public void enter_City(String city) {
		 txtbx_City.sendKeys(city);
	 }
	
	 public void select_State(String stateName) {
		 drpdwn_State.click();
		 try { Thread.sleep(2000);}
		 catch (InterruptedException e) {}
		 
		 for(WebElement state : state_List){
		 if(state.getText().equals(stateName)) {
		 state.click(); 
		 try { Thread.sleep(3000);}
		 catch (InterruptedException e) {}
		 break;
		 }
		 }
	 }
		 
	 public void enter_PostCode(String postCode) {
		 txtbx_PostCode.sendKeys(postCode);
	 }
	 
	 public void enter_Phone(String phone) {
	 txtbx_Phone.sendKeys(phone);
	 }
	 
	 public void click_Register() {
		 btn_Register.click();
	 }
	 
	 public void click_checkout3() {
		 btn_PrtoCout3.click();
	 }
	 
	 public void check_TermsAndCondition(boolean value) {
		 if(value) chkbx_AcceptTandC.click();
	 }
	 
	 public void click_checkout4() {
		 btn_PrtoCout4.click();
	 }
	 
	 public void select_PaymentMethod() {
		 paymentMethod_bankwire.click();
	 }
	 
	 public void click_confirmOrder() {
	 btn_ConfirmOrder.submit();
	 }
	 
	 public void Enter_emailAddress() {
		 enter_Email("Automation@gmail.com");
	 }
	 public void fill_PersonalDetails() {
	 enter_FirstName("Automation");
	 enter_LastName("Test");
	 enter_Password("testqa");
	 enter_Address("Shalimar Bagh");
	 enter_City("guli");
	 select_State("California");
	 enter_PostCode("12345");
	 enter_Phone("9876543210");
	 
	 } 
	}