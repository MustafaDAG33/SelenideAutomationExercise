package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;



import static com.codeborne.selenide.Selenide.$;


public class HomePage {

    public SelenideElement homePageVisible=$(By.xpath("//section[@id='slider']"));
    public SelenideElement signupLoginButton=$(By.xpath("//i[@class='fa fa-lock']"));
    public SelenideElement loggedInAsButton=$(By.xpath("//ul[@class='nav navbar-nav']//li[last()]"));
    public SelenideElement deleteAccountButton=$(By.partialLinkText("Delete Account"));
    public SelenideElement logoutButton=$(By.xpath("//i[@class='fa fa-lock']"));
    public SelenideElement contactUsButton=$(By.partialLinkText("Contact us"));
    public SelenideElement testCasesButton=$(By.partialLinkText("Test Cases"));
    public SelenideElement productsButton=$(By.partialLinkText("Products"));
    public SelenideElement cartButton=$(By.partialLinkText("Cart"));
    public SelenideElement subscription = $(By.xpath("//h2[.='Subscription']"));

}
