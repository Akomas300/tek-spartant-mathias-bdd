package tek.bdd.steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

import static tek.bdd.pages.HomePage.SIGN_IN_LINK;
import static tek.bdd.pages.SignInPages.*;

public class SecurityTestSteps extends SeleniumUtility{
    @Then("Validate sign in button is Enabled")
    public void validateSignInButtonIsEnabled(){
        Assert.assertTrue(isElementEnabled(SIGN_IN_LINK));
    }
    @When("user click on sign in link")
    public void userClickOnSignInLink(){
        clickLocator(SIGN_IN_LINK);
    }
    @Then("validate user in sign in page")
    public void validateUserInSingInPage(){
        Assert.assertEquals("Sign in",gettingText(By.className("login__subtitle")));
    }
    // @When("user enter username and password and click on login")
    // public void enterUserNamePasswordAndClickOnLogin(){
    //  sendText(SIGN_IN_EMAIL,"nasibamehraban1@gmail.com");
    //  sendText(SIGN_IN_PASSWORD,"Nasiba@123");
    // clickLocator(SIGN_IN_BUTTON);
    // }
    @When("user enter {string} and {string} and click on login")
    public void enterUserNamePasswordAndClickOnLogin(String userName, String pass) {
        sendText(SIGN_IN_EMAIL,userName);
        sendText(SIGN_IN_PASSWORD,pass);
        clickLocator(SIGN_IN_BUTTON);
    }
    @Then("user should be able to see account link")
    public void IsValid(){
        Assert.assertEquals("Account",gettingText(By.id("accountLink")));
    }

    @Then("user should see error {string}")
    public void userShouldSeeError(String arg0) {
        Assert.assertEquals(arg0,gettingText(By.className("error")));
    }
}
