import org.junit.jupiter.api.Test;

@org.junit.runner.RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(plugin = {"json:target/cucumber-report.json", "pretty"}, glue = {"com.glovoapp"})

public class GlovoTest {
}


