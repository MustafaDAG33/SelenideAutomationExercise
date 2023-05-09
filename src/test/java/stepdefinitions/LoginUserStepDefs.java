package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.*;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class LoginUserStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    DeleteAccountPage deleteAccountPage = new DeleteAccountPage();

    @Then("Verify Login to your account is visible")
    public void verify_login_to_your_account_is_visible() {
        loginPage.loginToYourAccountText.shouldBe(visible);
    }
    @Then("Enter correct email address and password")
    public void enter_correct_email_address_and_password() {
        loginPage.loginEmail.setValue("fatmabetul@gmail.com");
        loginPage.loginPassword.setValue("Fbetul18");
    }
    @Then("Click login button")
    public void click_login_button() {
        loginPage.loginButton.click();
    }
    @Then("Verify that ACCOUNT DELETED! is visible")
    public void verify_that_account_deleted_is_visible() {
        deleteAccountPage.accountDeletedText.shouldBe(visible);
    }


    @Then("Enter incorrect email address")
    public void enterIncorrectEmailAddress() {
        loginPage.loginEmail.setValue("fatmabet@gmail.com");
    }

    @Then("Enter incorrect password")
    public void enterIncorrectPassword() {
        loginPage.loginPassword.setValue("Fbet196");
    }

    @Then("Verify error Your email or password is incorrect! is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        loginPage.yourEmailOrPasswordIsIncorrectText.shouldBe(visible);
    }

    @Then("Click Logout button")
    public void clickLogoutButton() {
        homePage.logoutButton.click();
    }

    @Then("Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Assert.assertTrue(url().contains("login"));

    }
}
