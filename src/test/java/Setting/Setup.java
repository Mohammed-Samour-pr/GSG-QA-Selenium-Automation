/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Setting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Setup {

    public static ChromeOptions options;
    public static WebDriver driver;
    public static JavascriptExecutor executor;


    public static void setup(String url) {
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        executor = (JavascriptExecutor) driver;
        driver.get(url);
    }


}
