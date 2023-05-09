package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement newUserSignupText=$(By.xpath("//h2[.='New User Signup!']"));
    public SelenideElement loginToYourAccountText=$(By.xpath("//h2[.='Login to your account']"));
    public SelenideElement newUserName=$(By.xpath("//input[@data-qa='signup-name']"));
    public SelenideElement newUserEmail=$(By.xpath("//input[@data-qa='signup-email']"));
    public SelenideElement newUserButton=$(By.xpath("//button[@data-qa='signup-button']"));
    public SelenideElement loginEmail=$(By.xpath("//input[@data-qa='login-email']"));
    public SelenideElement loginPassword=$(By.xpath("//input[@data-qa='login-password']"));
    public SelenideElement loginButton=$(By.xpath("//button[@data-qa='login-button']"));
    public SelenideElement yourEmailOrPasswordIsIncorrectText=$(By.xpath("//*[.='Your email or password is incorrect!']"));
    public SelenideElement emailAddressAlreadyExistText=$(By.xpath("//*[.='Email Address already exist!']"));


}
