package tests;
import base.BaseTest1;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.RegisterPage1;

public class RegisterTest1 extends BaseTest1 {

    @Test
    public void signInClickTest() {
        RegisterPage1 registerPage =
                new RegisterPage1(driver);

        WebElement signInButton =
                driver.findElement(
                        AppiumBy.accessibilityId("New here? Create account")
                );

        signInButton.click();
        registerPage.enterFullName("Ramil");
        registerPage.enterEmail("memmedovramil780@gmail.com");
        registerPage.enterPassword("Bitcoin9918!");
        registerPage.clickCreateAccount();



    }
}
