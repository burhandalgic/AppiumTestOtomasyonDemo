package org.testOtomasyon.test;

import org.testOtomasyon.base.BaseTest;
import org.testOtomasyon.page.LoginPage;
import org.testOtomasyon.reports.ExtentsTestReports;
import org.testng.annotations.*;

public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeSuite
    public void setupSuite(){
        ExtentsTestReports.beforeeTest();
    }

    @AfterSuite
    public void afterSuite(){
        ExtentsTestReports.afterTest();
    }

    @BeforeClass
    public void beforeTest (){
        loginPage = new LoginPage(getAppiumDriver());
    }

    @Test
    public void Test() throws InterruptedException {
        loginPage
                .consultantClick()
                .loginClick()
                .numberTex()
                .sendCodeClick();
    }

    @AfterTest
    public void afterrTest(){
        tearDown();
    }



}
