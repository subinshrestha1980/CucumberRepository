package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefinations {
	WebDriver driver;
	LoginPage loginPage; // creating object
	
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page() throws InterruptedException {
		driver.get("https://techfios.com/billing/?ng=login/"); // Starting the driver
		Thread.sleep(2000);
		// System.out.println("User is on the Techfios login page");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void User_enters_username_as(String userName) throws InterruptedException {
		loginPage.enterUserName(userName);
		Thread.sleep(2000);
	}

	@Given("^User enter password as \"([^\"]*)\"$")
	public void user_enter_password_as(String password) throws Throwable {
		loginPage.enterPassword(password);
	}

	@When("^User clicks on the signin button$")
	public void user_clicks_on_the_signin_button() throws Throwable {
		loginPage.clickOnSignInButton();
		Thread.sleep(2000);
	}

	
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName, String password) {
		loginPage.enterCredentials(userName, password);
		
	}
	
	@Then("^User should land on the Dashboard page$")
	public void user_should_land_on_the_Dashboard_page() throws Throwable {
		// String exptectedTitle = "Dashboard- iBilling"; // for the case if soft assert
		// String actualtitle = loginPage.getPageTitle();

		Assert.assertEquals("Dashboard- iBilling", loginPage.getPageTitle()); // Hard assert
		loginPage.takeScreenshotAtEndOfTest(driver);

//		if (exptectedTitle.equalsIgnoreCase(actualtitle)) { //Soft Assert
//			System.out.println("Title Matched");
//
//		} else {
//			System.out.println("Title does not match !!");
//			loginPage.takeScreenshotAtEndOfTest(driver);
//		}
//		loginPage.takeScreenshotAtEndOfTest(driver);
	}


	@Then("^User click in bank and cash$")
	public void user_click_in_bank_and_cash() throws Throwable {
		loginPage.enterBanknCash();
	}

	@Then("^User click on new account$")
	public void user_click_on_new_account() throws Throwable {
		loginPage.enterNewAccount();
	}

	@Then("^User fill the form entnering \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_fill_the_form_entnering_and_and_and_and_and(String accountTitle, String discription,
		String initalBalance, String accountnumber, String contactPerson, String phone) throws Throwable {
		Thread.sleep(1000);
		loginPage.enteraccountTitle(accountTitle);
		Thread.sleep(1000);
		loginPage.enterdescription(discription);
		Thread.sleep(1000);
		loginPage.enterinitalBalance(initalBalance);
		Thread.sleep(1000);
		loginPage.enteraccountNumber(accountnumber);
		Thread.sleep(1000);
		loginPage.entercontactPerson(contactPerson);
		Thread.sleep(1000);
		loginPage.enterphone(phone);
		Thread.sleep(1000);

	}

	@Then("^User click in Submit Button$")
	public void user_click_in_Submit_Button() throws Throwable {
		loginPage.newsubmitButton();
	}
	

	@Then ("^User Should land on Account Page$")
	public void User_Should_land_on_Account_Page () throws IOException, InterruptedException {
		Assert.assertEquals("Accounts- iBilling", loginPage.getPageTitle());
		Thread.sleep(2000);
		loginPage.takeScreenshotAtEndOfTest(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}