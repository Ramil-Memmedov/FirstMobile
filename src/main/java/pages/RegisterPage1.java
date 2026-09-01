package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage1 {

    private final AndroidDriver driver;
    private WebDriverWait wait;
    private final By passwordField =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().className(\"android.widget.EditText\").instance(2)"
            );
    private final By createAccountButton =
            AppiumBy.accessibilityId("Create account");
    private final By fullNameField =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().className(\"android.widget.EditText\").instance(0)"
            );
    private final By emailField =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().className(\"android.widget.EditText\").instance(1)"
            );

    private final By signInButton =
            AppiumBy.accessibilityId("Sign in");
    public void enterFullName(String fullName) {

        WebElement input =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                fullNameField
                        )
                );

        input.click();

        input.sendKeys(fullName);
    }
    public void enterEmail(String email) {

        WebElement input =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                emailField
                        )
                );

        input.click();

        input.sendKeys(email);
    }
    public void enterPassword(String password) {

        WebElement input =
                wait.until(
                        ExpectedConditions.visibilityOfElementLocated(
                                passwordField
                        )
                );

        input.click();

        input.sendKeys(password);
    }
    public void clickCreateAccount() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        createAccountButton
                )
        ).click();
    }



    public RegisterPage1(AndroidDriver driver) {

        this.driver = driver;

        this.wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );
    }


    public void clickSignIn() {

        WebElement button =
                wait.until(
                        ExpectedConditions.elementToBeClickable(
                                signInButton
                        )
                );

        button.click();
    }
}
