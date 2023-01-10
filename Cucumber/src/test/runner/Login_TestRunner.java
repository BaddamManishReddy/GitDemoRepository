package test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Resources\\features\\Login.feature") //(features="foldername\\packagename\\classname.feature

public class Login_TestRunner {
	
	
}
