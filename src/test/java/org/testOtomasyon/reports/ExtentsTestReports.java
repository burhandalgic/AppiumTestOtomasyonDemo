package org.testOtomasyon.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentsTestReports {
    public static ExtentReports extent = new ExtentReports();

    public static void beforeeTest(){
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter( "loginPage.html");
        extent.attachReporter(htmlReporter);
    }

    public static void afterTest(){
       extent.flush();
    }



}
