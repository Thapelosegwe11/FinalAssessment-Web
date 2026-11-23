package TestCases;

import Pages.LandingPage;
import Utils.Base;
import org.testng.annotations.Test;

public class UserRegistrationTests extends Base {



    @Test
    public void verifyPageElements(){
        landingPage.verifyLandingPage();

    }

    @Test
    public void clickLoginButtonTest(){
        landingPage.clickMainLoginButton();
    }
}
