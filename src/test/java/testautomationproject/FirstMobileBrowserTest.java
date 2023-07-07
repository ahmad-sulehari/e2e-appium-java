package testautomationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class FirstMobileBrowserTest extends BrowserBase {
    @Test
    public void firstBrowserTest() throws InterruptedException {
        driver.get("http:amazon.com"); // opens a website inside (mobile) browser
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[type='text']")).click();
        driver.findElement(By.cssSelector("input[type='text']")).sendKeys("bags");
//        driver.findElement(By.cssSelector("input[type='text']")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("input[value='Go']")).click();
        Thread.sleep(2000);
        driver.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(5000);
    }

}
