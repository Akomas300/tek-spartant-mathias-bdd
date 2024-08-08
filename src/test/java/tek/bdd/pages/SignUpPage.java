package tek.bdd.pages;

import org.openqa.selenium.By;
import tek.bdd.base.BaseSetup;

public class SignUpPage {
    public static final By SIGN_UP_NAME= By.id("nameInput");
    public static final By SIGN_UP_EMAIL =By.id("emailInput");
    public static final By SIGN_UP_PASSWORD=By.id("passwordInput");
    public static final By SIGN_UP_CONFIRMPASSWORD=By.id("confirmPasswordInput");
    public static final By SIGN_UP_BUTTON=By.id("signupBtn");
}
