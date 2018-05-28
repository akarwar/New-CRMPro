package pro.freeCRM2.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ahsan\\eclipse-workspace\\pro.freeCRM2\\src\\main\\java\\pro\\freeCRM2\\Feature\\freeCRM.feature",
					glue= {"pro.freeCRM2.StepDeffination"},
					monochrome=true,
					strict=true,
					dryRun=false)

public class TestRunner {

}
