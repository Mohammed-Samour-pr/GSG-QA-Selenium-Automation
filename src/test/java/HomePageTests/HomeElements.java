package HomePageTests;

import Setting.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeElements {


    public static WebElement imgTest() {
        return Setup.driver.findElement(By.xpath("/html/body/footer/div[1]/div/div/div[2]/div/div[2]/imgaa"));
    }

    public static WebElement subscribeButton() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"mc4wp-form-2\"]/div[1]/div/inaaput[2]"));
    }

    public static WebElement heroSection() {
        return Setup.driver.findElement(By.id("heroSection"));
    }

    public static WebElement academyButton() {
        return Setup.driver.findElement(By.xpath("//a[@title='الأكاديمية']"));
    }

    public static WebElement partnersSection() {
        return Setup.driver.findElement(By.cssSelector(".kc-css-16652"));
    }

    public static WebElement specialistsSection() {
        return Setup.driver.findElement(By.cssSelector(".kc-css-616729"));
    }


    public static WebElement statisticsSection() {
        return Setup.driver.findElement(By.cssSelector(".kc-css-338666"));
    }


    public static WebElement reviewsSection() {
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/section[5]"));
    }

    public static WebElement stepsSection() {
        return Setup.driver.findElement(By.id("stepsSection"));
    }


    public static WebElement blogSection() {
        return Setup.driver.findElement(By.cssSelector(".kc-css-453375"));
    }


    public static WebElement successPartnersSection() {
        return Setup.driver.findElement(By.cssSelector(".kc-css-33649"));
    }


    public static WebElement footerSection() {
        return Setup.driver.findElement(By.cssSelector(".footer-top"));
    }






}
