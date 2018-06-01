package com.oleksa.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryT implements IRetryAnalyzer {

    private int retryCount = 0;
    private final static int MAX_RETRY_ATTEMPTS = 2;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if (retryCount < MAX_RETRY_ATTEMPTS) {
            retryCount++;
            return true;
        }
        return false;
    }
}
