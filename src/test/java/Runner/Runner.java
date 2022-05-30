package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="D:\\Rajesh\\Selenium Projects\\Cucumber\\src\\test\\resources\\Feature" ,//to specify feature file path
//glue={"stepDefinition","hooks"}, //Its combiles the feature file and step definition , additionally combines hooks with before and after

glue={"StepDef"},
//monochrome=true, // to give report in console with readable format
//plugin ={"html:report/webReport"} ,// its give the report in asked format
tags="@Smoke") // can specify which tag to run from multipls feature files
////tags="@Negative or @Smoke")

public class Runner {
	
	

}
