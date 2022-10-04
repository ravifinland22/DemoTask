package org.example.ui.pageobjects;

import io.appium.java_client.AppiumDriver;
import org.example.ui.util.AppiumInstance;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {
    protected AppiumDriver driver = AppiumInstance.getAppiumInstance(AppiumInstance.DRIVER.ANDROID);
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    public void closeDriver(){
        driver.quit();
    }
}
