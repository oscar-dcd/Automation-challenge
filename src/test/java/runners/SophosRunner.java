package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/Offer.feature",
		glue="stepdefinitions",
		tags="@Tag",
		snippets = SnippetType.CAMELCASE)
public class SophosRunner {

}
