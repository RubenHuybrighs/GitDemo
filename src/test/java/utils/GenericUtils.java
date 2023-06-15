package utils;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class GenericUtils {

    public WebDriver driver;
    public GenericUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void SwitchToNewTab() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }
}
