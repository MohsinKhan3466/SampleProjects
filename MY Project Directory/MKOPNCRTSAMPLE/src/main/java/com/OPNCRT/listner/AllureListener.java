package com.OPNCRT.listner;

import com.OPNCRT.base.BaseTest;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        captureScreenshot(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Optional: Log test success if needed
    }

    @Attachment(value = "Screenshot on Failure", type = "image/png")
    public byte[] captureScreenshot(ITestResult result) {
        BaseTest baseTest = (BaseTest) result.getInstance();
        return ((TakesScreenshot) baseTest.driver).getScreenshotAs(OutputType.BYTES);
    }

    @Attachment(value = "Log Output", type = "text/plain")
    public String attachLogs(String message) {
        return message;
    }
}
