package RunnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"AllFeatureFiles"},
		glue= {"StepDef"},
		dryRun=false,
				monochrome=true)


public class RunTestClass extends AbstractTestNGCucumberTests{

}
