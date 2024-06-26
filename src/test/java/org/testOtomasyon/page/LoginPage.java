package org.testOtomasyon.page;

import io.appium.java_client.AppiumDriver;
import org.testOtomasyon.base.BasePage;

import static org.testOtomasyon.constants.Constanst.*;

public class LoginPage extends BasePage {

    public LoginPage(AppiumDriver driver) {
        super(driver);
    }

    public LoginPage consultantClick () throws InterruptedException {
        infoLog("teste başlandı");
        Thread.sleep(1000);
        click(CONSULTANT_BUTTON);
        passLog("kurumsal butonuna tıklandı");
        Thread.sleep(1000);
        return this;
    }

    public LoginPage loginClick () throws InterruptedException {
        Thread.sleep(1000);
        click(LOGIN_BUTTON);
        passLog("login butonuna tıklandı");
        Thread.sleep(1000);
        return this;
    }

    public LoginPage numberTex () throws InterruptedException {
        Thread.sleep(1000);
        clear(NUMBER_TEX);
        passLog("metin silindi");
        Thread.sleep(1000);
        sendKeys(NUMBER_TEX,"5362333715");
        passLog("telefon numarası girildi");
        Thread.sleep(1000);
        return this;
    }
    public LoginPage sendCodeClick () throws InterruptedException {
        Thread.sleep(1000);
        click(SENT_CODE_BUTTON);
        passLog("kod gönder butonuna basıldı");
        Thread.sleep(1000);
        infoLog("test bitti");
        return this;
    }

}
