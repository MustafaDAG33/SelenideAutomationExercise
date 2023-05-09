package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;


public class SignupPage {


    public SelenideElement gender=$(By.xpath("//input[@id='id_gender2']"));
    public SelenideElement password=$("#password");
    public SelenideElement day=$("#days");
    public SelenideElement month=$("#months");
    public SelenideElement year=$("#years");
    public SelenideElement newsletter=$("#newsletter");
    public SelenideElement optin=$("#optin");
    public SelenideElement firstName=$("#first_name");
    public SelenideElement lastName=$("#last_name");
    public SelenideElement adres1=$("#address1");
    public SelenideElement country=$("#country");
    public SelenideElement state=$(By.xpath("//input[@id='state']"));
    public SelenideElement city=$(By.xpath("//input[@id='city']"));
    public SelenideElement zipcode=$("#zipcode");
    public SelenideElement mobileNumber=$("#mobile_number");
    public SelenideElement createAccount=$(By.xpath("//button[.='Create Account']"));



}
