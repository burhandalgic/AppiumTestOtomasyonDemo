package org.burhan;

import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait ;

    By consultantButton = By.id("mobi.appcent.apponte:id/btnInstitutional");

    @BeforeTest
    public void beforeTest() {

        try{
            DesiredCapabilities cap;
            cap = new DesiredCapabilities();
            cap.setCapability("deviceName","Pixel4Burhan");
            cap.setCapability("platformName","android");
            cap.setCapability("udid","emulator-5554");
            cap.setCapability("platformVersion","10.0");
            cap.setCapability("appPackage","mobi.appcent.apponte");
            cap.setCapability("appActivity","mobi.appcent.apponte.ui.activity.login.LoginActivity");
            cap.setCapability("skipUnlock","true");
            cap.setCapability("noReset","false");

            driver = new AndroidDriver<WebElement>( new URL("http://127.0.0.1:4723/wd/hub") ,  cap  );
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        } catch (MalformedURLException mal){
            System.out.println("Hatalı oluşturulmuş URL !");
        }


    }

    @Test
    public void test(){

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        WebElement consultantSelected = driver.findElement(consultantButton);
        consultantSelected.click();

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);



    }


    @AfterTest
    public void tearDown(){



    }


}
