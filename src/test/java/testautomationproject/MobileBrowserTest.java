package testautomationproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BrowserBaseTest{
    @Test
    public void browserTest() throws InterruptedException {

        driver.get("http://rahulshettyacademy.com/angularAppdemo");
        driver.findElement(By.xpath("//span[@class='navbar-toggler-icon']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[routerlink*='products']")).click();
        Thread.sleep(2000);
        driver.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(2000);
        String text = driver.findElement(By.cssSelector("a[href*='products/3']")).getText();
        Assert.assertEquals(text, "Devops");
    }
}
