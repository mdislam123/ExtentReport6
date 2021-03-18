package GoogleTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/GoogleSearch/B-facebook2.feature","src/test/resources/GoogleSearch/A-xbc1.feature"},
		//features="src/test/resources/GoogleSearch",
		glue= {"GoogleSteps"},
		dryRun=false,
		monochrome=true,
		//plugin= { "pretty", "html:target/cucumber-reports.html"}
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/rerun.txt"},
				
		tags= "@facebook1"
		)

public class MyTestRunner {

}
