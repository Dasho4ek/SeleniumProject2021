package StepDefinition;

import DriverWrapper.Web;
import Pages.HotelsHomepage;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class HotelsSD {
     Web web= new Web();
    HotelsHomepage hotels= new HotelsHomepage();


     @Given("I open website")
     public void launchWebpage(){
          web.openWebpage();
     }

  @When("I click on Sign In link")
  public void clickOnSignIn(){
          hotels.clickSignInLink();
  }
  @Then("I enter incorrect email address")
  public void enterEmailAddress(){
        hotels.enterEmail();
  }
  @And("I enter incorrect password")
     public void enterPasswd(){
         hotels.enterPassword();
  }
     @Then("I click on Sign In button")
     public void clickOnSignInButton(){
         hotels.clickSignInButton();
     }
     @And("I verify error message is displayed")
     public void errorMgsIsDisplayed(){
         hotels.errorMsgDisplayed();
     }
     @And("I quit website")
     public void quitPage(){
         web.quitWebpage();
     }












     }





