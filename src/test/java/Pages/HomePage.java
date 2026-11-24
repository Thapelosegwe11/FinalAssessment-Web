package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    //1. Call driver as a global to use in class.
    WebDriver driver;
    WebDriverWait wait;

    //2. Constructor method
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    //3.Page elements/locators.

    By HomescreenContent = By.xpath("(//span[text()='Home'][1])");

    By MainLoginButton = By.xpath("//span[text()='Login']");


    //4.Methods/Functions reading as user actions.

    public void verifyLandingPage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(HomescreenContent)).isDisplayed();
    }

    public void clickMainLoginButton(){
        wait.until(ExpectedConditions.elementToBeClickable(MainLoginButton)).click();
    }

}
