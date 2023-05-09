package stepdefinitions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.ProductsPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class ProductStepDefs {

    HomePage homePage = new HomePage();
    ProductsPage productsPage = new ProductsPage();

    @Given("Click on Products button")
    public void click_on_products_button() {
        homePage.productsButton.click();
        actions().moveByOffset(0,0).click().perform();
    }

    @When("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {

        sleep(2000);
        Assert.assertTrue(url().contains("products"));
    }

    @Then("The products list is visible")
    public void theProductsListIsVisible() {
        $(By.xpath("//div[@class='features_items']")).shouldHave(visible);
    }

    @Then("Click on View Product of first product")
    public void clickOnViewProductOfFirstProduct() {
        productsPage.firstProduct.click();
    }

    @Then("User is landed to product detail page")
    public void userIsLandedToProductDetailPage() {
        Assert.assertTrue(url().contains("product_details"));
    }

    @Then("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        $(By.xpath("//div[@class='product-information']")).shouldBe(visible);
    }


    @Then("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        productsPage.searchProduct.setValue("Tshirt");
        productsPage.submitSearch.click();

    }

    @Then("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        $(By.xpath("//h2[@class='title text-center']")).shouldHave(visible, Duration.ofSeconds(5));
    }

    @Then("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
    }
}
