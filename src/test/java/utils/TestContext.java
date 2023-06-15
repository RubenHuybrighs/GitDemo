package utils;

import org.openqa.selenium.WebDriver;
import pages.PageObjectManager;

import java.io.IOException;

public class TestContext {

    public WebDriver driver;
    public String landingPageProductName;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public GenericUtils genericUtils;

    public TestContext() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.GetDriver());
        genericUtils = new GenericUtils(testBase.GetDriver());
    }
}
