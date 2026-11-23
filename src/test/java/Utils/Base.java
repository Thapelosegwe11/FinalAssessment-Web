package Utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static Utils.BrowserFactory.driver;

public class Base {

    public static final BrowserFactory factory = new BrowserFactory();

    @BeforeClass
    public void setup(){

        driver = factory.launchBrowser("","https://ndosisimplifiedautomation.vercel.app/");


    }

    @AfterClass
    public void teardown(){

        if (driver != null){
            driver.quit();
        }
    }

}
