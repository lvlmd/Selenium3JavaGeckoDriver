import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by lvlmd on 2/25/17.
 */
public class TestSelenium3JavaGeckoDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "/Users/lvlmd/SeleniumTestTrainign/geckodriver");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        try {
            WebDriver driver = new FirefoxDriver();
            driver.get("http://google.com");
            Thread.sleep(1800);
        } catch (Exception e){
            System.out.println(e);
        }


}
