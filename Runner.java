package assignment_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/assignment_features", 
glue = "assignments_steps", monochrome = true, publish =true)

public class Runner extends AbstractTestNGCucumberTests {
	
}

