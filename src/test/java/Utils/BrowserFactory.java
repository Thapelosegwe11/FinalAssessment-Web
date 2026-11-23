package Utils;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Test;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver launchBrowser(String browserChoice, String url){

        if (browserChoice.equalsIgnoreCase("CHromE")){

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            //Headless for pipeline run, Turn OFF for local testing purposes.
            //options.addArguments("--headless");
            driver = new ChromeDriver(options);
            
        }else if(browserChoice.equalsIgnoreCase("Firefox")){

            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--incognito");
            driver = new FirefoxDriver(options);

        } else if (browserChoice.equalsIgnoreCase("Safari")) {

            driver = new SafariDriver();

        }else {

            EdgeOptions options = new EdgeOptions();
            options.addArguments("--incognito");
            driver = new EdgeDriver(options);
        }
        //For Testing purposes Locally.
        driver.manage().window().maximize();

        //Dimensions for locators during headless run in pipeline.
        driver.manage().window().setSize(new Dimension(1920,1080));

        driver.get(url);

        return driver;
    }

}
