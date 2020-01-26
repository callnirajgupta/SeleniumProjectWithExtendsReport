package com.manmohan.SampleSeleniumProject;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@target/rerun.txt", plugin = {
		"pretty", "html:target1/cucumber-html-report",
		"json:target1/cucumber.json", "junit:target1/cucumber.xml" }, glue = { "com.manmohan" } )

public class TestRunnerRerun {

}
