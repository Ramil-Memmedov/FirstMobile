package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LoginPage1 {

    private AppiumDriver driver;
    private By emailField = AppiumBy.androidUIAutomator(
            "new UiSelector().className(\"android.widget.EditText\").instance(0)"
    );
    private By passwordField = AppiumBy.androidUIAutomator(
            "new UiSelector().className(\"android.widget.EditText\").instance(1)"
    );
    private By signInButton = AppiumBy.androidUIAutomator(
            "new UiSelector().description(\"Sign in\").instance(1)"
    );
    public LoginPage1(AppiumDriver driver) {
        this.driver = driver;
    }
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickSignIn();
    }
}