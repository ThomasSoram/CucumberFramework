package Test1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/Feature",glue="stepdefinition",plugin={"pretty","html:target/cucumber-default-report.html","rerun:target/rerun.txt"},dryRun=false,monochrome=true)
public class runner {

}
