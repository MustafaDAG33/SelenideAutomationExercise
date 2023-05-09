package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class DeleteAccountPage {

    public SelenideElement accountDeletedText=$(By.xpath("//h2[@class='title text-center']"));
    public SelenideElement deleteContinue=$(By.xpath("//div[@class='pull-right']"));

}
