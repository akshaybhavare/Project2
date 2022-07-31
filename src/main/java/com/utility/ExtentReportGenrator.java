package com.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {

	public static ExtentReports extent;
	public static ExtentReports getReport() {
		
		String path="C:\\Users\\LENOVO\\eclipse-workspace\\Project2\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		
		reporter.config().setDocumentTitle("Test Report");
		reporter.config().setReportName("Demo Report name");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("project Name", "abc");
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("QA", "akshay");
		return extent;
		
		
	}
	
	
	
}
