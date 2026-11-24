package Utils;

import Pages.HomePage;
import Pages.LoginFormPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static Utils.BrowserFactory.driver;

public class Base {

    static final BrowserFactory factory = new BrowserFactory();

    final WebDriver driver = factory.launchBrowser("chrome","https://ndosisimplifiedautomation.vercel.app/");


    public  HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    public  LoginFormPage loginFormPage = PageFactory.initElements(driver, LoginFormPage.class);

}
