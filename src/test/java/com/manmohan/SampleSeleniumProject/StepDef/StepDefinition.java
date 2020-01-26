package com.manmohan.SampleSeleniumProject.StepDef;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.manmohan.PageObject.Login;
import com.manmohan.SampleSeleniumProject.util.SeleniumUtil;
import com.manmohan.SampleSeleniumProject.util.Xls_Reader;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
   
public class StepDefinition {
	
	Map<String,String> userDataMap = new HashMap<String,String>();
	private static Xls_Reader xls= new Xls_Reader();
	private static  Logger LOGGER=LogManager.getLogger(StepDefinition.class);
	
	static int  count=2;
	@Given("^user open the browser and enter url$")
	public void user_open_the_browser_and_enter_url_as() throws Throwable {
		CommonStep.scenario.write("I am insideSetup");
		
		System.out.println("print the url from data table"+xls.getCellData("FR01", "URL", CommonStep.getRownum()));
		System.out.println("print the url from data table"+xls.getCellData("FR01", "Password", CommonStep.getRownum()));
		System.out.println("print the url from data table"+xls.getCellData("FR01", "UserName", CommonStep.getRownum()));
		
		CommonStep.getTest().debug("user open the browser and enter url");
				  
	    // Write code here that turns the phrase above into concrete actions
		LOGGER.info("user open the browser and enter url");
		SeleniumUtil.navigate(xls.getCellData("FR01", "URL", CommonStep.getRownum()));
		//SeleniumUtil.navigate(SeleniumUtil.configProperties.getProperty("url"));
		CommonStep.getTest().debug("title");
		Login.validateLoginPageTitle();
		
		final byte[] screenshot =  ((TakesScreenshot) SeleniumUtil.getDriver()).getScreenshotAs(OutputType.BYTES);
		CommonStep.scenario.embed(screenshot, "image/png");
		
		CommonStep.scenario.write("taking screen shot");
		
		//String imagePath=SeleniumUtil.takeScreenShotReturnPath();
		//CommonStep.getTest().addScreenCaptureFromPath(imagePath, "open browser");
		
	}

	@When("^user enter userid and password$")
	public void user_enter_userid_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		CommonStep.scenario.write("user enter userid and password");
		
		
		CommonStep.getTest().debug("user enter userid and password");
		
	    Login.clickSignIn();
	    Login.validateSignInPage();
	    CommonStep.scenario.write("signin done");
	    String imagePath=SeleniumUtil.takeScreenShotReturnPath();
		
	    CommonStep.getTest().addScreenCaptureFromPath(imagePath, "open browser");
		
		
		CommonStep.getTest().debug("test execute is continue");
	    Assert.assertTrue("failed", false);
		
	}

	@Then("^Verify thta user is logged in successfully$")
	public void verify_thta_user_is_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@Given("^user create \"([^\"]*)\" account$")
	public void user_create_account(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("print the url from data table"+xls.getCellData("FR01", "URL", CommonStep.getRownum()));
		
		System.out.println("print the integer:"+arg1);
	    
	      int[] abc = new int[10]; 
	      abc[1]=1234;
	      abc[5]=1234;
	      abc[6]=12345;
	      
	      System.out.println("print the integer:"+abc[arg1]);
	}
	
	@Given("^usr enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void usr_enter_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    if(!CommonStep.scenario.getSourceTagNames().contains("@Testing")){
	    	
	    
		
		System.out.println("print"+arg1+"password"+arg2);
	    
	    userDataMap.put("username", arg1);
	    userDataMap.put("password", arg2);
	    }
	}

	
	@When("^user enter the details and fill form with following parameter for rowNum \"([^\"]*)\"$")
	public void fillform(int rownum,DataTable datatable){
	List<Map<String,String>> listmap=	datatable.asMaps(String.class, String.class);
	
	System.out.println("print form data "+listmap.get(rownum).get("Name"));
	System.out.println("print form data "+listmap.get(rownum).get("Title"));
	System.out.println("print form data "+listmap.get(rownum).get("Company"));
		
	}
	
	@Then("^verify that username is display in home page$")
	public void verifyuserNameAndPassword(){
		System.out.println("username"+userDataMap.get("username"));
		
	}
	
	@Given("^user enter following data$")
	public void user_enter_following_data(Map<String,String> map) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		System.out.println("print the map"+map.get("TITLE"));
		
		//entertitle(map.get("TITLE"),map.get("name"))
	    
	}
	
	@Given("^user enter following data in list$")
	public void user_enter_following_data_in_list(List<String> list) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	//List<String> list=	dataTable.asList(String.class);
	for(int i=0;i<list.size();i++){
		System.out.println("print the list"+list.get(i));	
	}
	
	}
	
	@Given("^user enter following data in list of list$")
	public void user_enter_following_data_in_list_of_list(List<List<String>> list) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	//List<List<String>> list=	dataTable.asLists(String.class);
		for (int j = 0; j < list.size(); j++) {
			for (int i = 0; i < list.get(j).size(); i++) {
				System.out.println("print the list" + list.get(j).get(i));
			}
		}
	}
    @Given("user enter the data from excel and execute number of time based data")
    public void dataproviderforStep1(){
    	
    	// xls= new Xls_Reader();
    	int rowCount=xls.getRowCount(CommonStep.getScenarioName());
    	
    	for(int i=2;i<=rowCount;i++){
    		System.out.println("print column value for row"+i+" : "+xls.getCellData(CommonStep.getScenarioName(), "Password", i) );
    		
    		System.out.println("print column value for row"+i+" : "+xls.getCellData(CommonStep.getScenarioName(), "URL", i) );
    		Login.enterUrl(xls.getCellData(CommonStep.getScenarioName(), "URL", i));
    	}
    	
    }
    
    
    @Given("^user enter url fromm rownum \"([^\"]*)\"$")
    public void user_enter_url_fromm_rownum(String rowNum) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	
    	/*System.out.println("pritn the value"+xls.getCellData(CommonStep.getScenarioName(), "URL", Integer.parseInt(rowNum)));
    	Login.enterUrl(xls.getCellData(CommonStep.getScenarioName(), "URL", Integer.parseInt(rowNum)));*/
    	
    	System.out.println("pritn the value"+xls.getCellData(CommonStep.getScenarioName(), "URL", 2));
    	Login.enterUrl(xls.getCellData(CommonStep.getScenarioName(), "URL", 2));
    }

    @When("^user enter username and password from rownum \"([^\"]*)\"$")
    public void user_enter_username_and_password_from_rownum(String rowNum) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("pritn the value"+xls.getCellData(CommonStep.getScenarioName(), "Password", Integer.parseInt(rowNum)));
    }

    @Then("^user get the details$")
    public void user_get_the_details() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        count++;
    }
}
