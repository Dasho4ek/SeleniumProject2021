package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HotelsHomepage extends Web {

    WebElement signInLocator= getDriver().findElement(By.xpath("//span[contains(text(),'Sign in']"));
    WebElement emailLocator= getDriver().findElement(By.xpath("//input[@id='sign-in-email']"));
    WebElement passwordLocator= getDriver().findElement(By.xpath("//input[@id='sign-in-password']"));
    WebElement signInEmailPasswordLocator= getDriver().findElement(By.xpath("//button[@id='sign-in-button']"));
    WebElement signInErrorMsgLocator= getDriver().findElement(By.xpath("//div[@class='msg-error-icon msg-big mb-spider'] "));





 public void clickSignInLink(){
     signInLocator.click();
 }

    public void enterEmail (){
     emailLocator.sendKeys("asdf@mail.com");
    }

    public void enterPassword(){
     passwordLocator.sendKeys("qwe1$29g");
    }

    public void clickSignInButton(){
     signInEmailPasswordLocator.click();
    }

    public boolean errorMsgDisplayed(){
     return signInErrorMsgLocator.isDisplayed();
    }





}