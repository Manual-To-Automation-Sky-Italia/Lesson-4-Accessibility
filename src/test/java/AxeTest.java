import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.results.Rule;
import com.deque.html.axecore.selenium.AxeBuilder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class AxeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sky.it/");

        AxeBuilder builder = new AxeBuilder();
        Results results = builder.analyze(driver);
        List<Rule> violations = results.getViolations();
        System.out.println(violations.size());

        for (Rule currentRuleViolation : violations) {
            System.out.println(currentRuleViolation.getDescription());
        }

        driver.quit();
    }
}