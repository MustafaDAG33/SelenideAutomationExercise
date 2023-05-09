package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import pages.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class RegisterUserStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    DeleteAccountPage deleteAccountPage = new DeleteAccountPage();

    @Given("Click on Signup Login button")
    public void click_on_signup_login_button() {
        homePage.signupLoginButton.click();
    }


    @Then("Verify New User Signup is visible")
    public void verifyNewUserSignupIsVisible() {
        loginPage.newUserSignupText.shouldBe(visible);
    }

    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() {
        loginPage.newUserName.setValue("Betul");
        loginPage.newUserEmail.setValue("fatmabetul@gmail.com");
    }

    @Then("Click Signup button")
    public void clickSignupButton() {
        executeJavaScript("arguments[0].click();",loginPage.newUserButton);
    }

    @Then("Verify that ENTER ACCOUNT INFORMATION is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        $(By.xpath("//b[.='Enter Account Information']")).shouldBe(visible);
    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        signupPage.gender.click();
        actions().sendKeys(Keys.PAGE_DOWN).perform();
        signupPage.password.setValue("Fbetul17");
        signupPage.day.selectOption(7);
        signupPage.month.selectOption("December");
        signupPage.year.selectOption("2020");

    }

    @Then("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        executeJavaScript("arguments[0].click();",signupPage.newsletter);

    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        signupPage.optin.click();
    }

    @Then("Fill details: First name, Last name, Company, Address, Country, State, City, Zipcode, Mobile Number")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber() {
        signupPage.firstName.setValue("Fatma");
        signupPage.lastName.setValue("YUKSEK");
        signupPage.adres1.setValue("Ogretmenler mah. no:117 Tarsus/Mersin");
        signupPage.state.setValue("Mersin");
        signupPage.city.setValue("Tarsus");
        signupPage.zipcode.setValue("171717");
        signupPage.mobileNumber.setValue("05175171717");
    }

    @Then("Click Create Account button")
    public void clickCreateAccountButton() {
        executeJavaScript("arguments[0].click();",signupPage.createAccount);

    }

    @Then("Verify that ACCOUNT CREATED! is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        actions().moveByOffset(0,0).click().perform();
        accountCreatedPage.accountCreatedText.shouldBe(visible);
    }

    @Then("Click Continue button")
    public void clickContinueButton() {
        accountCreatedPage.continueButton.click();
    }

    @Then("Verify that Logged in as username is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        actions().moveByOffset(0,0).click().perform();
        homePage.loggedInAsButton.shouldBe(visible);
    }

    @Then("Click Delete Account button")
    public void clickDeleteAccountButton() {
        //WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(10));
        homePage.deleteAccountButton.should(visible,Duration.ofSeconds(10));
        //homePage.deleteAccountButton.shouldHave(text("Hello World!"),Duration.ofSeconds(10));//SELENIDE WAIT
        executeJavaScript("arguments[0].click();",homePage.deleteAccountButton);
    }

    @Then("Verify that ACCOUNT DELETED! is visible and click Continue button")
    public void verifyThatACCOUNTDELETEDIsVisibleAndClickContinueButton() {
        deleteAccountPage.accountDeletedText.shouldBe(visible);
        deleteAccountPage.deleteContinue.click();
    }

    @And("take screenshot")
    public void takeScreenshot() {
        screenshot("image");
    }

    @Then("Enter name and already registered email address")
    public void enterNameAndAlreadyRegisteredEmailAddress() {
        loginPage.newUserName.sendKeys("Halil");
        loginPage.newUserEmail.setValue("fatmabetull@gmail.com");
    }

    @Then("Verify error Email Address already exist is visible")
    public void verifyErrorEmailAddressAlreadyExistIsVisible() {
        loginPage.emailAddressAlreadyExistText.shouldBe(visible);
    }
}
