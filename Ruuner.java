package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(features="src/test/java/features/DeleteLead.feature",glue="Steps",monochrome=true,
											dryRun=false,snippets=SnippetType.CAMELCASE,publish=true)

public class Ruuner extends AbstractTestNGCucumberTests{

}

