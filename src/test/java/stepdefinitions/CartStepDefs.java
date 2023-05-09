package stepdefinitions;

import com.codeborne.selenide.Condition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CartStepDefs {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    DeleteAccountPage deleteAccountPage = new DeleteAccountPage();
    ViewCartPage viewCartPage = new ViewCartPage();
    ProductsPage productsPage = new ProductsPage();

    @Given("Click Cart button")
    public void click_cart_button() {
        homePage.cartButton.click();
    }

    @Given("Click Products button")
    public void clickProductsButton() {
        homePage.productsButton.click();
        actions().moveByOffset(0,0).click().perform();
        sleep(5000);
        actions().sendKeys(Keys.PAGE_DOWN).perform();
        sleep(2000);
    }

    @Then("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        actions().moveToElement(productsPage.firstProduct).perform();
        sleep(2000);
        executeJavaScript("arguments[0].click();",productsPage.firstProduct);
        sleep(2000);


    }

    @Then("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        sleep(2000);
        executeJavaScript("arguments[0].click();",productsPage.continueShopping);
        sleep(2000);
    }

    @Then("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        actions().moveToElement(productsPage.secondProduct).perform();
        sleep(2000);
        executeJavaScript("arguments[0].click();",productsPage.secondProduct);
        sleep(2000);
    }

    @Then("Click View Cart button")
    public void clickViewCartButton() {
        executeJavaScript("arguments[0].click();",viewCartPage.viewCart);
        sleep(2000);
    }

    @Then("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        viewCartPage.cartInfoTable.shouldBe(visible);
    }

    @Then("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {
        Assert.assertTrue(viewCartPage.prices.size()==3);
    }


    @Given("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {
        executeJavaScript("arguments[0].click();",productsPage.viewProduct);
        actions().moveByOffset(0,0).click().perform();

    }

    @When("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        productsPage.productInfo.shouldBe(visible);
    }

    @Then("Increase quantity to four")
    public void ıncreaseQuantityTo() {

        productsPage.quantity.clear();
        productsPage.quantity.setValue("4");

    }

    @Then("Click Add to cart button")
    public void clickAddToCartButton() {
        productsPage.addToCart.click();
        sleep(3000);
    }

    @Then("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        viewCartPage.cartInfoTable.shouldBe(visible);
    }


}
