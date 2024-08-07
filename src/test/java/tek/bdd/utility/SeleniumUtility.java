package tek.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.bdd.base.BaseSetup;

import java.time.Duration;

import static tek.bdd.base.BaseSetup.getDriver;

public class SeleniumUtility  extends BaseSetup {
    private WebDriverWait getWait() {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    private WebElement waitForVisibility(By locator) {
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clickLocator(By locator) {
        //WebDriverWait wait=new WebDriverWait(getDriver(), Duration.ofSeconds(20));
        // getWait().until(ExpectedConditions.elementToBeClickable(locator))
        waitForVisibility(locator).click();

    }

    public void sendText(By locator, String text) {
        //getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
        waitForVisibility(locator).sendKeys(text);

    }

    public String gettingText(By locator) {
        // return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator))
        return waitForVisibility(locator).getText();
    }

    public boolean isElementEnabled(By locator) {
        return waitForVisibility(locator)
                .isEnabled();

    }

    public byte[] takeScreenShot() {
        TakesScreenshot screenShot = (TakesScreenshot) getDriver();
        return screenShot.getScreenshotAs(OutputType.BYTES);
    }
}