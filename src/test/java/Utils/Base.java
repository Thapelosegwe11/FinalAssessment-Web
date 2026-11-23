package Utils;

import Pages.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static Utils.BrowserFactory.driver;

public class Base {

    public static final BrowserFactory factory = new BrowserFactory();

    public WebDriver driver;
    public LandingPage landingPage;

    @BeforeClass
    public void setup(){

        driver = factory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");

        landingPage = PageFactory.initElements(driver, LandingPage.class);


    }

    @AfterClass
    public void teardown(){

        if (driver != null){
            driver.quit();
        }
    }

}
