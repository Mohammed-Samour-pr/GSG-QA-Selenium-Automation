/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package SpecialistsPageTests;

import HomePageTests.HomeElements;
import Setting.Setup;
import Setting.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class SpecialistsPage {

    @BeforeClass
    public void initialize() {
        Setup.setup("https://famcare.app/");
    }

    @Test(priority = 1)
    public void TC1_verifyThatlinkspecialistsIsDisplayed() {
        Assert.assertTrue(SpecialistsElements.linkspecialists().isDisplayed());
    }

    @Test(priority = 2)
    public void TC2_verifyThatlinkspecialistsIsclick() {
        SpecialistsElements.linkspecialists().click();
    }

    @Test(priority = 2)
    public void TC3_verifyThattitelspecialistsIsDisplayed() {
        Assert.assertTrue(SpecialistsElements.titelspecialists().isDisplayed());
    }


    @Test(priority = 3)
    public void TC4_verifyThatSearchSpecialistsIsDisplayed() {
        Assert.assertTrue(SpecialistsElements.searchspecialists().isDisplayed());
    }


    @Test(priority = 4)
    public void TC5_SearchSpecialists() {
        SpecialistsElements.searchspecialists().sendKeys("محمد الحمزه");
        SpecialistsElements.searchspecialists().submit();
    }


    @Test(priority = 5)
    public void TC6_verifyThatSearchResult() {
        Assert.assertTrue(SpecialistsElements.searchResult("محمد الحمزه").isDisplayed());
    }

    @Test(priority = 6)
    public void TC7_verifyThatJoinUsSpecialist() {
        Assert.assertTrue(SpecialistsElements.joinbutton().isDisplayed());
    }


    @Test(priority = 7)
    public void TC8_verifyThatViewProfielAfterSerch() {
        SpecialistsElements.btnprofile().click();
        TC2_verifyThatlinkspecialistsIsclick();
    }


    @Test(priority = 8)
    public void TC9_verifyThatJoinUsSpecialist() {
        SpecialistsElements.joinbutton().click();
    }

    @Test(priority = 9)
    public void TC10_verifyThatJoinUsSpecialistForm() {
        SpecialistsElements.name().sendKeys("mohammed");
        SpecialistsElements.phone().sendKeys("0592384541");
        SpecialistsElements.degree().sendKeys("IT");
        SpecialistsElements.specialization().sendKeys("IT");
        SpecialistsElements.experience().sendKeys("10");
        SpecialistsElements.socialmedia().sendKeys("fb");
        SpecialistsElements.submitform().click();
        Assert.assertEquals(SpecialistsElements.responseForm().getText(), "شكراً لك. لقد تم الإرسال بنجاح.");
    }


    @AfterClass
    void tearDown() {
        Setup.driver.quit();
    }


}