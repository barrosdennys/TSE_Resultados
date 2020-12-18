package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import util.DriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Define the features files location
        features = {"src/test/resources/features"},

        // Define the steps files location
        glue = {"steps"},

        // Readable format of the console output from Cucumber
        monochrome = true,

        // Code snippets will be created using camelcase
        snippets = CucumberOptions.SnippetType.CAMELCASE,

        // Plugins
        plugin = {"pretty", "html:target/cucumber-html-report"}
)
class CucumberRunner {

    @AfterClass
    public static void tearDown(){
        DriverManager.closeDriver();
    }
}
