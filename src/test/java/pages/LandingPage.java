package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    public WebDriver driver;
    private By search = By.xpath("//input[@type='search']");
    private By productName = By.cssSelector("h4.product-name");
    private By topDeals = By.linkText("Top Deals");
    private By increment = By.cssSelector("a.increment");
    private By addToCart = By.cssSelector(".product-action button");

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchItem(String productName) {
        driver.findElement(search).sendKeys(productName);
    }

    public void getSearchText() {
        driver.findElement(search).getText();
    }

    public void incrementQuantity(int quantity) {
        int i = quantity-1;
        while(i>0) {
            driver.findElement(increment).click();
            i--;
        }
    }

    public void addToCart() {
        driver.findElement(addToCart).click();
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public void selectTopDeals() {
        driver.findElement(topDeals).click();
    }

    public String getLandingPageTitle() {
        return driver.getTitle();
    }
}
