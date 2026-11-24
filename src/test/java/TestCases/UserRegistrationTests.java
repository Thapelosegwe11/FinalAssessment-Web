package TestCases;

import Utils.Base;
import org.testng.annotations.Test;

public class UserRegistrationTests extends Base {



    @Test
    public void NavigateToUserRegistration(){
        homePage.verifyLandingPage();
        homePage.clickMainLoginButton();
    }

    @Test
    public void clickSignUpButtonTest(){
        loginFormPage.clickSignUp();
    }

}
