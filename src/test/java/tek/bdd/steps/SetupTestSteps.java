package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.utility.SeleniumUtility;

import static tek.bdd.pages.HomePage.SIGN_IN_LINK;
import static tek.bdd.pages.SignInPages.*;

public class SetupTestSteps extends SeleniumUtility {
    @Given("Open browser and navigate to retail app")
    public void openBrowserAndNavigate(){
        setupBrowser();
    }
    @Then("Validate top left corner is TEKSCHOOL")
    public void validateTopLeftLogo(){
        String text = gettingText(By.className("top-nav__logo"));
        System.out.println(text);
        Assert.assertEquals("TEKSCHOOL",text);
    }
    @Then("Close the browser")
    public void closeBrowser(){
        quitBrowser();
    }

}
