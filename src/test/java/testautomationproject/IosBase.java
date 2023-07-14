package testautomationproject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class IosBase {
    public IOSDriver driver;
    //    public AppiumDriverLocalService service;
    @BeforeClass
    public void configureAppium() throws MalformedURLException {

        XCUITestOptions options = new XCUITestOptions();
        options.setDeviceName("iPhone 12 pro max (automation)");
        options.setApp("//Users//ahmad.sulehari//Library//Developer//Xcode//DerivedData//UIKitCatalog-avkgynqpvrqvdbefojzlrzqroelh//Build//Products//Debug-iphoneos//UIKitCatalog.app");
        options.setUdid("00008101-00112C4C3A44001E");
        options.setPlatformVersion("16.3.1");
        options.setWdaLaunchTimeout(Duration.ofSeconds(20));
        options.setCapability("useNewWDA", false);

        driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
