package hooks;

import io.cucumber.java.Before;
import pages.HomePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {


    HomePage homePage = new HomePage();
    @Before
    public void setUp(){
        open("https://automationexercise.com");
        homePage.homePageVisible.shouldBe(visible);

    }




}
