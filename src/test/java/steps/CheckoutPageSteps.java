package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.CheckoutPage;
import utils.TestContext;

public class CheckoutPageSteps {

    public CheckoutPage checkoutPage;
    TestContext testContext;

    public CheckoutPageSteps(TestContext testContext) {
        this.testContext = testContext;
        checkoutPage = testContext.pageObjectManager.getCheckoutPage();
    }

    @And("verify user has ability to enter promo code and place the order")
    public void verifyUserHasAbilityToEnterPromoCodeAndPlaceTheOrder() {
        Assert.assertTrue(checkoutPage.VerifyPromoBtn());
        Assert.assertTrue(checkoutPage.VerifyPlaceOrder());
    }

    @Then("^user proceeds to checkout and validate the (.+) items in the checkout page$")
    public void userProceedsToCheckoutAndValidateTheNameItemsInTheCheckoutPage(String name) {
        checkoutPage.CheckoutItems();
    }
}
