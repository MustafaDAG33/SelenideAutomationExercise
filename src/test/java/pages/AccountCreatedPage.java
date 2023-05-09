package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;


public class AccountCreatedPage {

    public SelenideElement accountCreatedText=$(By.xpath("//b[.='Account Created!']"));
    public SelenideElement continueButton=$(By.xpath("//a[.='Continue']"));


}
