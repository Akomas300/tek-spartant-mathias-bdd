package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.SignInPages;
import tek.bdd.pages.SignUpPage;
import tek.bdd.utility.SeleniumUtility;

import static tek.bdd.pages.HomePage.SIGN_IN_LINK;
import static tek.bdd.pages.SignInPages.NEW_ACCOUNT_BUTTON;
import static tek.bdd.pages.SignUpPage.SIGN_UP_NAME;

public class CreateAccountStep extends SeleniumUtility {
    @When("click on create new account button")
    public void clickOnCreateNewAccountButton(){
        clickLocator(NEW_ACCOUNT_BUTTON);

    }

    @Then("validate user in sign up page")
    public void validateUserInSignUpPage(){

    }
    @When("user inter name,email,password,confirmPassword")
    public void InterNameEmailPasswordAdnConfirmPassword(){
        sendText(SIGN_UP_NAME,"Mathias");
        sendText(SignUpPage.SIGN_UP_EMAIL,"akowa300@gmail.com");
        sendText(SignUpPage.SIGN_UP_PASSWORD,"Mathias123!");
        sendText(SignUpPage.SIGN_UP_CONFIRMPASSWORD,"Mathias123!");

    }

    @Then("confirm user successfully sign up")
    public void confirmUserSuccessfullySignUp(){
        String buttonText=gettingText(By.id("logoutBtn"));
        Assert.assertEquals("Log out",buttonText);
    }

    @When("user inter {string},{string},{string} and {string}")
    public void userInterAnd(String name, String email, String password, String confirmPassword) {
        sendText(SIGN_UP_NAME,"Mathias");
        sendText(SignUpPage.SIGN_UP_EMAIL,"akowa300@gmail.com");
        sendText(SignUpPage.SIGN_UP_PASSWORD,"Mathias123!");
        sendText(SignUpPage.SIGN_UP_CONFIRMPASSWORD,"Mathias123!");
    }
}
