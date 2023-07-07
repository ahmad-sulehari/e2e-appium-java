package testautomationproject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserBase {
    public AndroidDriver driver;
    @BeforeClass
    public void configureAppium() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Galaxy Note10");
        options.setUdid("R58MB59BXBZ");
        options.setCapability("browserName", "Chrome");
        options.setChromedriverExecutable("//Users//ahmad.sulehari//Downloads//chromedriver_mac64//chromedriver");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
