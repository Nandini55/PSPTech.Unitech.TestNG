package com.psptech.unitech.cucumber.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) // Always import from junit annotation file.
@CucumberOptions(features = "Feature",
glue = "com.psptech.unitech.cucumber.steps",
monochrome = true,
//plugin - if you want to generate a report- specify the html report in target folder and file name
plugin = {"pretty", "html:target/cucumber-reports"}
				

)



public class JUnitRunner {

}
