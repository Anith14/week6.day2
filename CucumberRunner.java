package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import step.Base;

@CucumberOptions(features= "src/test/java/features"
,glue="step"
,monochrome=true
,publish=true)
public class CucumberRunner extends Base {

}


