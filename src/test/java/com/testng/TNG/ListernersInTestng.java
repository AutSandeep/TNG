package com.testng.TNG;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListernersInTestng implements ITestListener {

	public void onTestStart(ITestResult result) {
		// This will execute before each test starts 
		System.out.println("Test is  "+getMethodName(result));
		Reporter.log("Test is  "+getMethodName(result));
	}

	public void onTestSuccess(ITestResult result) {
		// This will execute after every test pass
		System.out.println("Test passed  "+getMethodName(result));
		Reporter.log("Test passed  "+getMethodName(result));
	}

	public void onTestFailure(ITestResult result) {
		// This will execute after every test fail in a class
		System.out.println("Test is failed  "+getMethodName(result));
		Reporter.log("Test is failed  "+getMethodName(result));
	}

	public void onTestSkipped(ITestResult result) {
		// This will execute once the test is skipped 
		System.out.println("Test Skipped  "+getMethodName(result));
		Reporter.log("Test Skipped  "+getMethodName(result));
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test is passed based on percentage  "+getMethodName(result));
		Reporter.log("Test is passed based on percentage  "+getMethodName(result));
	}

	public void onStart(ITestContext context) {
		// This will execute before all the Test is executed in a Class
		System.out.println("All Test Execution started ");
		Reporter.log("All Test Execution started ");
		
	}

	public void onFinish(ITestContext context) {
		// This will execute once all the Test is executed in a Class
		System.out.println("All Test Execution completed ");
		Reporter.log("All Test Execution completed ");
		
	}
	
	private static String getMethodName(ITestResult result) {
		
		return result.getMethod().getConstructorOrMethod().getName();
	}

}
