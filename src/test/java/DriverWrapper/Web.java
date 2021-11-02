package DriverWrapper;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web {

    public WebDriver driver = null;

    @Before
    public void openWebpage() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        driver= new ChromeDriver();
        driver.get("https://www.hotels.com/");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void quitWebpage(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

}
