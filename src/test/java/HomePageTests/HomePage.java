package HomePageTests;

import Setting.Setup;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class HomePage {

    @BeforeClass
    public void initialize() {
        Setup.setup("https://famcare.app/");
    }

    @Test(priority = 1)
    public void verifyThatHeroSectionIsDisplayed() {

        Assert.assertTrue(HomeElements.heroSection().isDisplayed());
    }

    @Test(priority = 2)
    public void verifyThatPartnersSectionIsDisplayed() {
        Assert.assertTrue(HomeElements.partnersSection().isDisplayed());
    }

    @Test(priority = 3)
    public void verifyThatSpecialistsSectionIsDisplayed() {
        Assert.assertTrue(HomeElements.specialistsSection().isDisplayed());
    }

    @Test(priority = 4)
    public void verifyThatStatisticsSectionIsDisplayed() {
        Assert.assertTrue(HomeElements.statisticsSection().isDisplayed());
    }

    @Test(priority = 5)
    public void verifyThatReviewsSectionIsDisplayed() {
        Assert.assertTrue(HomeElements.reviewsSection().isDisplayed());
    }

    @Test(priority = 6)
    public void verifyThatStepsSectionIsDisplayed() {
        Assert.assertTrue(HomeElements.stepsSection().isDisplayed());
    }

    @Test(priority = 7)
    public void verifyThatBlogSectionIsDisplayed() {
        Assert.assertTrue(HomeElements.blogSection().isDisplayed());
    }

    @Test(priority = 8)
    public void verifyThatSuccessPartnersSectionIsDisplayed() {
        Assert.assertTrue(HomeElements.successPartnersSection().isDisplayed());
    }

    @Test(priority = 10)
    public void verifyThatFooterSectionIsDisplayed() {
        Assert.assertTrue(HomeElements.footerSection().isDisplayed());
    }

    @Test(priority = 11)
    public void verifyThatAcademyButtonIsDisplayed() {
        Assert.assertTrue(HomeElements.academyButton().isDisplayed());
    }


}
