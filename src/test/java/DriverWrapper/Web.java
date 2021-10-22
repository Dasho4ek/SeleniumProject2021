package DriverWrapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web {

    public WebDriver driver = null;

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

    public void quitWebpage(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

}
