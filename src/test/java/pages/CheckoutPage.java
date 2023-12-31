package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    public WebDriver driver;
    By cartBag = By.cssSelector("[alt='Cart']");
    By checkOutBtn = By.xpath("//button[contains(text(), 'PROCEED TO CHECKOUT')]");
    By promoBtn = By.cssSelector(".promoBtn");
    By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void CheckoutItems() {
        driver.findElement(cartBag).click();
        driver.findElement(checkOutBtn).click();
    }

    public boolean VerifyPromoBtn() {
        return driver.findElement(promoBtn).isDisplayed();
    }

    public boolean VerifyPlaceOrder() {
        return driver.findElement(placeOrder).isDisplayed();
    }
}
