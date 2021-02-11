package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement User_Name;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignIn;
	@FindBy(how = How.XPATH, using = "//i[@class='fa fa-university']")
	WebElement BankNCash;
	@FindBy(how = How.XPATH, using = "//a[text()='New Account']")
	WebElement newAccount;
	@FindBy(how = How.XPATH, using = "//input[@name='account']")
	WebElement accountTitle;
	@FindBy(how = How.XPATH, using = "//input[@name='description']")
	WebElement description;
	@FindBy(how = How.XPATH, using = "//input[@name='balance']")
	WebElement initalBalance;
	@FindBy(how = How.XPATH, using = "//input[@name='account_number']")
	WebElement accountNumber;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_person']")
	WebElement contactPerson;
	@FindBy(how = How.XPATH, using = "//input[@name='contact_phone']")
	WebElement phone;
	@FindBy(how = How.XPATH, using = "//button[@type='submit' and @class='btn btn-primary']")
	WebElement submitButton;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Accounts ')]")
	WebElement ManageAccountsValidation;
	
	// Interactive method
	public void enterUserName(String userName) {
		User_Name.sendKeys(userName);
	}

	public void enterPassword(String password) {
		Password.sendKeys(password);
	}
	 String enterName;	
	 	public void enterCredentials(String userName, String password) {
		User_Name.sendKeys(userName);
		Password.sendKeys(password);
	}

	public void clickOnSignInButton() {
		SignIn.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void enterBanknCash() {
		BankNCash.click();
	}

	public void enterNewAccount() {
		newAccount.click();
	}

	public void enteraccountTitle(String newaccountTitle) {
		
		accountTitle.sendKeys(newaccountTitle);
	}

	public void enterdescription(String newdescription) {
		description.sendKeys(newdescription);
	}

	public void enterinitalBalance(String newinitalBalance) {
		initalBalance.sendKeys(newinitalBalance);
	}

	public void enteraccountNumber(String newaccountNumber) {
		accountNumber.sendKeys(newaccountNumber);
	}

	public void entercontactPerson(String newcontactPerson) {
		contactPerson.sendKeys(newcontactPerson);
	}

	public void enterphone(String newphone) {
		phone.sendKeys(newphone);
	}

	public void newsubmitButton() {
		submitButton.click();
	}

	public void validationManageAccountPage(){
		ManageAccountsValidation.getText();
	}
	public void takeScreenshotAtEndOfTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);// create an object and it is an interface
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss"); // create object for the date
		Date date = new Date(); // import it from java.util
		String label = formatter.format(date);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currrentDir = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile, new File(currrentDir + "/screenshots/" + label + ".png")); // you can put .png to
																									// JPEG
	}
}
