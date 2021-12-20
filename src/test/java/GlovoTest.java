import org.junit.jupiter.api.Test;

@org.junit.runner.RunWith(io.cucumber.junit.Cucumber.class)
@io.cucumber.junit.CucumberOptions(plugin = {"json:target/cucumber-report.json", "pretty"}, glue = {"com.glovoapp"})

public class GlovoTest {
}



//public abstract class Page {
//
//    WebDriverWait wait;
//    Faker faker = new Faker();
//    protected WebDriver driver;
//
//    public Page(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    }
//
//    public By generateXpath (String searchText){
//        return By.xpath("//*[contains(text(),'"+searchText+"')]/..");
//    }
//
//    public void waitAndClick(By el){
//        wait.until(ExpectedConditions.elementToBeClickable(el)).click();
//
//    }
//
//}