package org.testOtomasyon.base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testOtomasyon.reports.ExtentsTestReports;
import org.testng.annotations.BeforeClass;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest extends ExtentsTestReports {

    public static AppiumDriver driver;
    public static WebDriverWait wait ;


    @BeforeClass
    public void setup() {

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

    public AppiumDriver getAppiumDriver(){
        return driver;
    }

    public void setAppiumDriver(AppiumDriver appiumDriver){
        driver = appiumDriver;
    }

    public void tearDown(){
        driver.quit();
    }










}
