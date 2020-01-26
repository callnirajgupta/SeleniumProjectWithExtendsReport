package com.manmohan.SampleSeleniumProject.StepDef;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.manmohan.SampleSeleniumProject.TestRunner;
import com.manmohan.SampleSeleniumProject.util.SeleniumUtil;
import com.manmohan.SampleSeleniumProject.util.Xls_Reader;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommonStep {
	WebDriver driver;
   
    //helps to generate the logs in test report.
    private static int  rowNum;
	private static ExtentTest test;
	private static boolean flag;
	public static Scenario scenario;
	private static  Logger LOGGER=LogManager.getLogger(CommonStep.class);
	private static String scenarioName;
	


	

	private static int count=0;
	@Before
	public void setup(Scenario scenario){
		LOGGER.info("I am insideSetup");
		
		
		CommonStep.scenario=scenario;
	
		 scenarioName=scenario.getName();
		/*Xls_Reader xls= new Xls_Reader();
		 rowNum=xls.getCellRowNum("FR01", "ScenarioName", scenarioName);
		String runmode=xls.getCellData("FR01", "RunMode", rowNum);
		
				
		if(runmode.equalsIgnoreCase("N")){
			Assume.assumeTrue(false);
		}else if(runmode.equalsIgnoreCase("")){
			Assume.assumeTrue(false);
		}*/
		
		test = TestRunner.getExtent().createTest("Test Case "+count, scenarioName);
	    
		SeleniumUtil.getInstance();
		driver=SeleniumUtil.getDriver();
	}
    
	
	@Before("@tag2,@Tag1,@test1")
	public void login1(){
		System.out.println("testing for Tag2");
		
	}
		
	
	
	@After
	public void tearDown(Scenario scenario){
		LOGGER.info("I am tearDown");
		scenario.write("I am inside tear down");
		if(test!=null && driver != null){
		if(scenario.isFailed()){	
		final byte[] screenshot =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshot, "image/png"); // stick it in the report
		
		test.log(Status.FAIL, MarkupHelper.createLabel(" FAILED ", ExtentColor.RED));
		}else{	
			test.log(Status.PASS, MarkupHelper.createLabel(" Passed ", ExtentColor.GREEN));
		}
		
		driver.close();
		
		SeleniumUtil.setDriver(null);
		}
		
	count++;
		
	}
	
	@After("@Tag2")
	public void login2(){
		
	}
	
	public static int getRownum() {
		return rowNum;
	}


	public static void setRownum(int rownum) {
		CommonStep.rowNum = rownum;
	}


	public static boolean isFlag() {
		return flag;
	}


	public static void setFlag(boolean flag) {
		CommonStep.flag = flag;
	}
	
	public static ExtentTest getTest() {
		return test;
	}
	
	 public static String getScenarioName() {
			return scenarioName;
		}
}
