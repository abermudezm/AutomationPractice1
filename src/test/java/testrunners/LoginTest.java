package testrunners;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepsdefinitions","hooks"},
        tags = "not @ignore",
        plugin = {"pretty",
                  "html:target/SystemTestReports/html.html",
                  "json:target/SystemTestReports/json/report.json",
                  "junit:target/SystemTestReports/junit/report.xml" })
public class LoginTest {
}
