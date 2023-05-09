package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ViewCartPage {



    public SelenideElement viewCart = $(By.xpath("//u[.='View Cart']"));
    public SelenideElement cartInfoTable = $("#cart_info_table");
    public ElementsCollection prices = $$(By.xpath("//table//td[3]"));
    public ElementsCollection quantities = $$(By.xpath("//table//td[4]"));
    public ElementsCollection totals = $$(By.xpath("//table//td[5]"));


}
