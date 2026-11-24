package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginFormPage {

    //1.Globals.
    WebDriver driver;
    WebDriverWait wait;


    //2.Constructor.
    public LoginFormPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    //3.Page elements;

    By SignUpButton = By.id("signup-toggle");



    //4.Descriptive method/user action.

    public void clickSignUp(){
        wait.until(ExpectedConditions.elementToBeClickable(SignUpButton)).click();
    }
}
