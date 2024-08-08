package tek.bdd.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import tek.bdd.pages.SignUpPage;
import tek.bdd.utility.SeleniumUtility;

public class CommonSteps extends SeleniumUtility {
    @When("user click on {string} link")
    public void userClickOnLink(String text) {
        clickLocator(By.linkText(text));
    }

    @When("user click on {string} button")
    public void clickOnButton(String text) {
        String buttonXpath="//button[text()='"+text+"']";
        clickLocator(By.xpath(buttonXpath));

    }
}
