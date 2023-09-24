/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package SpecialistsPageTests;

import Setting.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SpecialistsElements {

    public static WebElement linkspecialists() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
    }


    public static WebElement titelspecialists() {
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1"));
    }


    public static WebElement searchspecialists() {
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/label/input"));
    }

    public static WebElement bookNowButton() {
        return Setup.driver.findElement(By.id("bookNow"));
    }

    public static WebElement joinbutton() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
    }


    public static WebElement name() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[2]/input"));
    }

    public static WebElement phone() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[3]/input"));
    }

    public static WebElement degree() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[4]/input"));
    }

    public static WebElement specialization() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[5]/input"));
    }

    public static WebElement experience() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[6]/input"));
    }

    public static WebElement socialmedia() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[7]/input"));
    }


    public static WebElement submitform() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/input"));
    }

    public static WebElement searchResult(String text) {
        return Setup.driver.findElement(By.linkText(text));
    }

    public static WebElement btnprofile() {
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/a[1]"));
    }

    public static WebElement responseForm() {
        return Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/div[8]"));
    }


}
