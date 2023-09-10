package homePageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homePage {

    WebDriver driver;
    ChromeOptions options;
    JavascriptExecutor executor;

    @BeforeClass
    public void setup() {
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();

        executor = (JavascriptExecutor) driver;
    }


    @Test(priority = 1)
    public void test() {
        driver.get("https://wewill.tech");
    }
}
