package org.example.ui.util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumInstance {
    public enum DRIVER{
        ANDROID,IOS;
    }
    private static AppiumDriver appiumDriver;

     public static AppiumDriver getAppiumInstance(DRIVER driver){
         DesiredCapabilities capabilities;
         if(appiumDriver==null){
             switch (driver){
                 case IOS:
                     capabilities= new DesiredCapabilities();
                     capabilities.setCapability("platformName","iOS");
                     capabilities.setCapability("platformVersion","/the/ios/version");
                     capabilities.setCapability("automationName","XCUITest");
                     capabilities.setCapability("app","/path/to/app");
                     capabilities.setCapability("deviceName","");
                     capabilities.setCapability("udid","/device/id");
                     appiumDriver=new IOSDriver(capabilities);
                     break;
                 case ANDROID:
                     capabilities= new DesiredCapabilities();
                     capabilities.setCapability("platformName","Android");
                     capabilities.setCapability("platformVersion","12");
                     capabilities.setCapability("automationName","UIAutomator2");
                     capabilities.setCapability("app",System.getProperty("user.dir")+"/src/main/resources/base.apk");
                     //capabilities.setCapability("appPackage","com.profit.trade");
                     //capabilities.setCapability("appActivity","com.profit.trade.MainActivity");
                     try {
                         appiumDriver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
                     } catch (MalformedURLException e) {
                         throw new RuntimeException(e);
                     }
                     break;
             }
         }
         return appiumDriver;
     }
}
