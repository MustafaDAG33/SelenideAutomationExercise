package stepdefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.HomePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class ContactUsStepDefs {

    HomePage homePage = new HomePage();

    @Given("Click on Contact Us button")
    public void click_on_contact_us_button() {
        homePage.contactUsButton.click();
    }
    @When("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {
        $(By.xpath("//h2[.='Get In Touch']")).shouldBe(visible);
    }
    @Then("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        $(By.xpath("//input[@name='name']")).sendKeys("Orhan", Keys.TAB,"orhan@gmail.com",Keys.TAB,"Sikayet",Keys.TAB,"Thanks");
    }
    @Then("Upload file")
    public void upload_file() {
        String path = "C:\\Users\\LENOVA\\Desktop\\scrum.png";
        $(By.xpath("//*[@name='upload_file']")).setValue(path);
    }
    @Then("Click Submit button")
    public void click_submit_button() {
        executeJavaScript("arguments[0].click();",$(By.xpath("//input[@name='submit']")));

    }
    @Then("Click OK button")
    public void click_ok_button() {
        switchTo().alert().accept();
    }
    @Then("Verify success message Success! Your details have been submitted successfully. is visible")
    public void verify_success_message_success_your_details_have_been_submitted_successfully_is_visible() {
        $(By.xpath("//div[@class='status alert alert-success']")).shouldBe(visible);
    }
    @Then("Click Home button and verify that landed to home page successfully")
    public void click_home_button_and_verify_that_landed_to_home_page_successfully() {
        $(By.partialLinkText("Home")).click();
        actions().moveByOffset(0,0).click().perform();
        homePage.homePageVisible.shouldBe(visible);
    }

    @Given("Click on Test Cases button")
    public void clickOnTestCasesButton() {
        homePage.testCasesButton.click();
        actions().moveByOffset(0,0).click().perform();
        sleep(3000);

    }

    @When("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertTrue(url().contains("test_cases"));
        Assert.assertTrue(title().contains("Practice"));

    }

    @Given("Scroll down to footer")
    public void scrollDownToFooter() {
        executeJavaScript("arguments[0].scrollIntoView(true);",homePage.subscription);
    }

    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        homePage.subscription.shouldBe(visible);
    }

    @Then("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        $("#susbscribe_email").sendKeys("fatmabetul@gmail.com", Keys.ENTER);
    }

    @Then("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        $(By.xpath("//*[.='You have been successfully subscribed!']")).shouldBe(visible);
    }
}
