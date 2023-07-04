package testautomationproject;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {
    public AndroidDriver driver;
//    public AppiumDriverLocalService service;
    @BeforeClass
    public void configureAppium() throws MalformedURLException {

//         service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
//                .withIPAddress("http://127.0.0.1").usingPort(4723).build();
//         service.start();

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Galaxy Note10");
        options.setApp("//Users//ahmad.sulehari//IdeaProjects//myproject//src//test//java//resources//ApiDemos-debug.apk");
        options.setUdid("R58MB59BXBZ");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
//        service.stop();
    }
}
