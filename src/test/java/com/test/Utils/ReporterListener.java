package com.test.Utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReporterListener implements ITestListener {
    @Override
    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub
        System.out.println("test is finished");

    }


    @Override
    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub
        System.out.println("test is started");

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("test is started*******************************************");

    }

    @Override
    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub
        System.out.println("test is sucessfull*******************************************");

    }
}
