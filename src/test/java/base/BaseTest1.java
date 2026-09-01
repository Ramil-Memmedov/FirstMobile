package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.URI;

public class BaseTest1 {

    protected AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName("UiAutomator2");

        options.setDeviceName("Android Emulator");
        options.setUdid("emulator-5554");

        options.setApp(
                "C:\\\\Users\\\\Ramil\\\\Documents\\\\app-release (2).apk"
        );

        options.setAutoGrantPermissions(true);

        driver = new AndroidDriver(
                URI.create(
                        "http://127.0.0.1:4723"
                ).toURL(),
                options
        );
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }
}