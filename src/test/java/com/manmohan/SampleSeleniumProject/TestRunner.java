package com.manmohan.SampleSeleniumProject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags =  "@DataProvider1", plugin = {
		"pretty", "html:target/cucumber-html-report",
		"json:target/cucumber.json","junit:target/cucumber.xml" ,"rerun:target/rerun.txt" }, glue = { "com.manmohan" } )


public class TestRunner {
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extent;
	
	
	@BeforeClass
	public static void beforeclass(){
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/target/test-report.html");
		extent = new ExtentReports();
	    extent.attachReporter(htmlReporter);
	     
	    //To add system or environment info by using the setSystemInfo method.
	    extent.setSystemInfo("OS", System.getProperty("os.name"));
	    extent.setSystemInfo("Browser", "browser");
	    
	    //configuration items to change the look and feel
	    //add content, manage tests etc
	    //htmlReporter.config().setChartVisibilityOnOpen(true);
	    htmlReporter.config().setDocumentTitle("Extent Report Demo");
	    htmlReporter.config().setReportName("Test Report");
	    
	    htmlReporter.config().setTheme(Theme.STANDARD);
	    htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		
	}
	
	public static ExtentHtmlReporter getHtmlReporter() {
		return htmlReporter;
	}

	public static ExtentReports getExtent() {
		return extent;
	}
    
	@AfterClass
	public static void afterClass(){
		extent.flush();
		
	}
	
}
