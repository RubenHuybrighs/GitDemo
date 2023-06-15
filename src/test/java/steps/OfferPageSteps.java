package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LandingPage;
import pages.OffersPage;
import utils.TestContext;

public class OfferPageSteps {
    public TestContext testContext;
    public String offerPageProductName;

    public OfferPageSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @Then("^user searches for (.+) in offerspage$")
    public void userSearchesForInOfferspage(String productName) throws InterruptedException {
        switchToOffersPage();

        OffersPage offersPage = testContext.pageObjectManager.getOffersPage();
        offersPage.searchItem(productName);
        Thread.sleep(2000);
        offerPageProductName = offersPage.getProductName();
    }

    public void switchToOffersPage() throws InterruptedException {
        //if(testContext.driver.getCurrentUrl().equals("https://rahulshettyacademy.com/seleniumPractise/#/offers")){}
        LandingPage landingPage = testContext.pageObjectManager.getLandingPage();
        landingPage.selectTopDeals();
        Thread.sleep(2000);
        testContext.genericUtils.SwitchToNewTab();
    }

    @And("validate product name in offers page matches with landing page")
    public void validateProductNameInOffersPageMatchesWithLandingPage() {
        Assert.assertEquals(offerPageProductName, testContext.landingPageProductName);
    }
}
