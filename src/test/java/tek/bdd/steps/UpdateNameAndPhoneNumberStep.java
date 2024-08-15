package tek.bdd.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import tek.bdd.pages.ProfilePage;
import tek.bdd.utility.SeleniumUtility;

import java.util.Map;


public class UpdateNameAndPhoneNumberStep extends SeleniumUtility {
    @When("user update information")
    public void userUpdateInformation(DataTable dataTable) {
        Map<String,String> data=dataTable.asMap();
        String name=data.get("name");
        String phoneNumber=data.get("phoneNumber");
        //.Toastify__toast-icon
        sendText(ProfilePage.NAME_INPUT,name);
        sendText(ProfilePage.PHONE_NUMBER_INPUT,phoneNumber);
    }

    @Then("validate user information update successfully")
    public void validateUserInformationUpdateSuccessfully() {
        //Assert.assertEquals("Personal Information Updated Successfully",gettingText(By.xpath("//div[text()='Personal Information Updated Successfully']")));
        Assert.assertTrue(waitForVisibility(By.className("Toastify__toast-icon")).isDisplayed());
    }

    @When("user enter change the password")
    public void userEnterChangeThePassword(DataTable dataTable) {
        Map<String,String> data=dataTable.asMap();
        String oldPassword=data.get("previousPassword");
        String newPassword=data.get("newPassword");
        String confirmPassword=data.get("confirmPassword");
        sendText(By.id("previousPasswordInput"),oldPassword);
        sendText(By.id("newPasswordInput"),newPassword);
        sendText(By.id("confirmPasswordInput"),confirmPassword);
    }

    @When("user enter {string} in the search box")
    public void userEnterInTheSearchBox(String text) {
        sendText(By.id("searchInput"),text);
    }

    @When("user click on search")
    public void userClickOnSearch() {
        clickLocator(By.id("searchBtn"));
    }

    @Then("validate searched products display on the page")
    public void validateSearchedProductsDisplayOnThePage() {
       boolean isDisplay= waitForVisibility(By.xpath("//div[@data-id='1']/img")).isDisplayed();
       Assert.assertTrue(isDisplay);
    }

    @When("user click on the {string} image")
    public void userClickOnTheImageAndAddItToTheCart(String text) {
        clickLocator(By.xpath("//div[@data-id='1']/img"));

    }

    @When("user click on cart")
    public void userClickOnCart() throws InterruptedException {
        clickLocator(By.cssSelector("#cartBtn"));
        Thread.sleep(2000);
    }

    @When("user validate one item has been add to the cart")
    public void userValidateOneItemHasBeenAddToTheCart() {
        String text= gettingText(By.cssSelector("#totalQuantity"));
        Assert.assertEquals(text,"(1)");
    }

    @When("user click on Add to Cart button")
    public void userClickOnAddToCartButton() {
        clickLocator(By.id("addToCartBtn"));
    }

    @When("user delete the item from the cart")
    public void userDeleteTheItemFromTheCart() {
        clickLocator(By.className("cart__item-delete"));
    }

    @Then("user validate the the item has been deleted")
    public void userValidateTheTheItemHasBeenDeleted() {
       String text = gettingText(By.className("cart__empty-title"));
       Assert.assertEquals(text,"Your Shopping Cart is Empty");
    }
}
