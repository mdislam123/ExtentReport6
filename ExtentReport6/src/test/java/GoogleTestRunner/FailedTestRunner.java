package GoogleTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="@target/rerun.txt",
		glue= {"GoogleSteps"},
		dryRun=false,
		monochrome=true,
		plugin= { "pretty", "html:target/cucumber-reports.html"},
		//plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				
		tags= "@facebook"
		)

public class FailedTestRunner {
	
	

}
