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
    WebElement emailErrorLocator= getDriver().findElement(By.xpath("//small[@id='email-error']"));
    WebElement incorrectPswMsgLocator= getDriver().findElement(By.xpath("//small[@id='password-error']"));
    WebElement firstNameErrorLocator= getDriver().findElement(By.xpath("//small[@id='firstName-error']"));
    WebElement enterFirstNameLocator= getDriver().findElement(By.xpath("//input[@id='sign-up-first-name']"));
    WebElement enterLastNameLocator= getDriver().findElement(By.xpath("//input[@id='sign-up-last-name"));
    WebElement lastNameErrorLocator= getDriver().findElement(By.xpath("//small[@id='lastName-error']"));









 public void clickSignInLink(){
     signInLocator.click();
 }
 public void enterEmail (){
     emailLocator.sendKeys("a^df@mail.com");
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
    public void enterIncorrectEmailAddress(){
     emailLocator.sendKeys("#!@###");
    }
public void ifErrorEmailMessageDisplayed()
{String expEmailMessage= "Please check your email address";
    String emailErrorMsgText=emailErrorLocator.getText();
    Assert.assertEquals(expEmailMessage,emailErrorMsgText, "Email error message is not as expected");
 }
public void enterIncorrectPswWithLessThen6Characters(){
     incorrectPswMsgLocator.sendKeys("asdf");
}
public void ifErrorPasswordMessageDisplayed(){
     String expPswMessage= "Please enter a password containing at least six characters";
     String pswErrorMsgText=incorrectPswMsgLocator.getText();
     Assert.assertEquals(expPswMessage, pswErrorMsgText, "Password error message is not as expected");}

     public void enterPswGreater20Characters(){
     passwordLocator.sendKeys("asdfghjklqwertyuiopzxc");
     }
     public void ifErrorMsgGreater20CharactersDisplayed(){
     String expErrorMessage= "Your password cannot be more than 20 characters long.";
     String errorMsgLocator= incorrectPswMsgLocator.getText();
     Assert.assertEquals(errorMsgLocator, expErrorMessage, "Password error is not as expected");
     }
 public void enterIncorrectFirstName(){ enterFirstNameLocator.sendKeys("s@#D3");
 }
public void ifErrorFirstNameMessageDisplayed(){
     String expNameErrorMsg= "Please check your first name";
     String nameErrorText= firstNameErrorLocator.getText();
     Assert.assertEquals(expNameErrorMsg, nameErrorText, "Enter first name error is not as expected");
}
    public void enterIncorrectLastName(){ enterLastNameLocator.sendKeys("s@#D3");
    }
    public void ifErrorLastNameMessageDisplayed(){
        String expNameErrorMsg= "Please check your last name";
        String nameErrorText= lastNameErrorLocator.getText();
        Assert.assertEquals(expNameErrorMsg, nameErrorText, "Enter last name error is not as expected");}











}