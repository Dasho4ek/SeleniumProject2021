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
    WebElement signUpLinkLocator= getDriver().findElement(By.xpath("//a[contains(text(),'Sign up']"));
    WebElement TermsConditionsLink= getDriver().findElement(By.xpath("//a[@id='sign-up-tc']"));
    WebElement checkInCalendar= getDriver().findElement(By.xpath("//span[contains(text(),'Check in')]"));
    WebElement guestLocator= getDriver().findElement(By.xpath("//span[contains(text(),'Guests')]"));





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

 public void clickSignUpLink(){
     signUpLinkLocator.click();
 }
public void clickOnTermsAndConditions(){ TermsConditionsLink.click();}
public void clickOnCheckInCalendar(){checkInCalendar.click();}
public void clickOnGuests(){guestLocator.click();}


}