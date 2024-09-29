package co.com.certifications.sofka.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features.feature/buys_items.feature",
        glue = {"co.com.certifications.sofka.stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CucumberTestSuite {
}
