package org.testOtomasyon;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
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

public class UnUseTest {
    public AppiumDriver<WebElement> driver;
    public WebDriverWait wait ;
    By consultantButton = By.id("mobi.appcent.apponte:id/btnInstitutional");
    By loginButton = By.xpath("//android.widget.Button[@resource-id=\"mobi.appcent.apponte:id/ibSignIn\"]");
    By numberTex = By.id("mobi.appcent.apponte:id/etPhoneNumber");
    By sentCodeButton = By.id("mobi.appcent.apponte:id/btnSendCode");
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
            wait = new WebDriverWait(driver, 10);

        } catch (MalformedURLException mal){
            System.out.println("Hatalı oluşturulmuş URL !");
        }


    }

    @Test
    public void test() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement consultantSelected = driver.findElement(consultantButton);
        consultantSelected.click();

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement loginSelect = driver.findElement(loginButton);
        loginSelect.click();

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement phoneNumberSelect = driver.findElement(numberTex);
        phoneNumberSelect.click();
        driver.getKeyboard().sendKeys("5362333715");

        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        WebElement senCodeSelect = driver.findElement(sentCodeButton);
        senCodeSelect.click();

        Thread.sleep(10000);

        /* Tex karşılaştırma
         android.widget.TextView  =   clas ismi
        if (driver.findElementByXPath("//android.widget.TextView[@Text='Burhan Dalgıç']").isDisplayed()){
            driver.findElementByXPath("//android.widget.TextView[@Text='Burhan Dalgıç']").click();
        }
         */

        /* Kaydırma işlemi
        TouchAction swipe = new TouchAction<>(driver)
                .press(PointOption.point(600,2000))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(600,2000))
                .release()
                .perform();
         */




    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }


}
