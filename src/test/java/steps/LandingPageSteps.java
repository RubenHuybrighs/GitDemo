package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LandingPage;
import utils.TestContext;

public class LandingPageSteps {

    LandingPage landingPage;
    TestContext testContext;

    public LandingPageSteps(TestContext testContext) {
        this.testContext = testContext;
        landingPage = testContext.pageObjectManager.getLandingPage();
    }

    @Given("user is on GreenCart landing page")
    public void user_is_on_green_cart_landing_page() {
        Assert.assertTrue(landingPage.getLandingPageTitle().contains("GreenKart"));
    }

    @When("^user searches for (.+) and extracts actual name of product$")
    public void user_searches_for_and_extracts_actual_name_of_product(String productName) throws InterruptedException {
        landingPage.searchItem(productName);
        Thread.sleep(2000);
        testContext.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
        System.out.println(testContext.landingPageProductName + " is extracted from homepage.");
    }

    @And("added {string} items of the selected product to the cart")
    public void addedItemsOfTheSelectedProductToTheCart(String quantity) {
        landingPage.incrementQuantity(Integer.parseInt(quantity));
        landingPage.addToCart();
    }
}
