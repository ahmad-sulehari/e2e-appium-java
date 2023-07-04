package testautomationproject;

import com.beust.ah.A;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AppiumBasics extends Base {
//    @Test
//    public void wifiSettingName() throws InterruptedException {
//
////        driver.findElement(AppiumBy.accessibilityId("App")).click();
//        driver.findElement(AppiumBy.accessibilityId("Views")).click();
//        Thread.sleep(2000);
//        driver.findElement(AppiumBy.accessibilityId("Auto Complete")).click();
//        Thread.sleep(2000);
//        driver.findElement(AppiumBy.accessibilityId("1. Screen Top")).click();
//        Thread.sleep(2000);
//        driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).click();
//        Thread.sleep(2000);
//        driver.findElement(AppiumBy.id("io.appium.android.apis:id/edit")).sendKeys("hello");
//        Thread.sleep(5000);
//
//    }

    @Test
    public void setDate() throws InterruptedException {

//        driver.findElement(AppiumBy.accessibilityId("App")).click();
        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Date Widgets")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("1. Dialog")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("change the date")).click();
        Thread.sleep(2000);
        String date = "%02d July 2023";
        LocalDate localDate = LocalDate.now();//For reference
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd");
        String formattedString = localDate.format(formatter);
        int covertedDate = Integer.parseInt(formattedString);
        covertedDate = covertedDate + 3;
        String finalDate = String.format(date, covertedDate);

        driver.findElement(AppiumBy.accessibilityId(finalDate)).click();
        Thread.sleep(5000);

    }

}
