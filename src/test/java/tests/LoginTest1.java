package tests;

import base.BaseTest1;
import org.testng.annotations.Test;
import pages.LoginPage1;

public class LoginTest1 extends BaseTest1 {

    @Test
    public void loginTest() {

        LoginPage1 loginPage = new LoginPage1(driver);

        loginPage.login(
                "test@gmail.com",
                "123456"
        );
    }
}