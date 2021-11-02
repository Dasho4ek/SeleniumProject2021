package StepDefinition;

import DriverWrapper.Web;
import Pages.HotelsHomepage;
import cucumber.api.java.Before;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.Test;

public class HotelsSD {
     Web web= new Web();
    HotelsHomepage hotels= new HotelsHomepage();

/* TC-21

 */

  @When("I click on Sign In link")
  public void clickOnSignIn(){hotels.clickSignInLink();}
  @Then("I enter incorrect email address")
  public void enterEmailAddress(){hotels.enterEmail();}
  @And("I enter incorrect password")
     public void enterPasswd(){hotels.enterPassword();}
     @Then("I click on Sign In button")
     public void clickOnSignInButton(){hotels.clickSignInButton();}
     @And("I verify error message is displayed")
     public void errorMgsIsDisplayed() {hotels.errorMsgDisplayed();}

   /* TC-22

    */

    @Then("I click on Sign Up link")
    public void clickOnSignUpLink(){hotels.clickSignUpLink();}
    @Then ("I enter incorrect email address with at least '@' symbol")
    public void enterIncorrectEmail(){hotels.enterIncorrectEmailAddress();}
    @And("I verify error is displayed- Please check your email address")
    public void checkEmailErrorMsgDisplayed(){hotels.ifErrorEmailMessageDisplayed();}
     @Then("I enter incorrect password with less than 6-characters")
    public void enterIncorrectPsw(){hotels.enterIncorrectPswWithLessThen6Characters();}
    @And("I verify if error message is displayed- Please enter a password containing at least six characters")
    public void verifyIfPswErrorDisplayed(){hotels.ifErrorPasswordMessageDisplayed();}
     @Then("I enter password greater than 20-characters")
    public void enterPswMoreThan20Characters(){hotels.enterPswGreater20Characters();}
    @And("I verify error is displayed- Your password cannot be more than 20 characters long")
    public void passwordErrorMsg (){hotels.ifErrorMsgGreater20CharactersDisplayed();}
    @Then("I enter invalid first name")
    public void enterInvalidFN(){hotels.enterIncorrectFirstName();}
    @Then("I verify error is displayed-Please check your first name")
    public void ifErrorFNDisplayed(){hotels.ifErrorFirstNameMessageDisplayed();}
    @Then("I enter invalid last name")
    public void enterInvalidLN(){hotels.enterIncorrectLastName();}
    @And("I verify error is displayed- Please check your last name")
    public void ifErrorMsgLastNameDisplayed(){hotels.ifErrorLastNameMessageDisplayed();}















     }





