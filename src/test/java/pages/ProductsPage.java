package pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class ProductsPage {


    //public SelenideElement firstProduct=$(By.xpath("(//*[.='View Product'])[1]"));
    public SelenideElement secondProduct=$(By.xpath("(//*[@class='btn btn-default add-to-cart'])[3]"));
    public SelenideElement firstProduct=$(By.xpath("(//*[@class='btn btn-default add-to-cart'])[1]"));
    public SelenideElement searchProduct=$("#search_product");
    public SelenideElement submitSearch=$("#submit_search");
    //public SelenideElement firstProduct = $((By.xpath("(//a[@class='btn btn-default add-to-cart'])[1]")));
    public SelenideElement continueShopping = $(By.xpath("//*[.='Continue Shopping']"));
    public SelenideElement viewProduct = $(By.xpath("(//*[@class='fa fa-plus-square'])[2]"));
    public SelenideElement productInfo = $(By.xpath("//*[@class='product-information']"));
    public SelenideElement quantity = $("#quantity");
    public SelenideElement addToCart = $(By.xpath("//button[@class='btn btn-default cart']"));




}
