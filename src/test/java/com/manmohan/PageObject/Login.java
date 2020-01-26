package com.manmohan.PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.manmohan.SampleSeleniumProject.util.SeleniumUtil;

public class Login {
	static WebDriver driver=SeleniumUtil.getDriver();
	public static final String TITLE="My Store";
	public static final String SIGN_IN_XPATH = "//a[contains(text(),'Sign in')]";
	public static final String EMAIL_ID="email";
	
	
	public static void validateLoginPageTitle(){
		
		Assert.assertEquals("The title of the page is not matching", TITLE,driver.getTitle());
		
	}
	
	public static void clickSignIn(){
		SeleniumUtil.clickLink(By.xpath(SIGN_IN_XPATH));
	}

	public static void validateSignInPage(){
		SeleniumUtil.isElementDiplayed(By.id(EMAIL_ID));
		
	}
	
	public static void enterUrl(String url){
		
		SeleniumUtil.navigate(url);
		
	}
}
