package Stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Logindemo.feature",glue= {"Stepdefinitions"},
monochrome=true,
plugin= {"pretty","junit:target/JunitReports/report.xml","json:target/JSONReports/report.json", "html:target/HtmlReports/report.html"})
//,tags="@smoketest")
public class TestRunnerClass {

}
