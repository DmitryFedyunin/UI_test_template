package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import pasges.base.BasePage;
import pasges.chian_home.ChianHomePage;
import pasges.listing.ChianListingPage;

import static common.Config.CLEAR_COOKOES_AND_STORAGE;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected ChianHomePage chianHomePage = new ChianHomePage(driver);
    protected ChianListingPage chianListingPage = new ChianListingPage(driver);

    @AfterTest
    public void clearCookiesAndLocalStorage(){
        if (CLEAR_COOKOES_AND_STORAGE){
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clear()");

        }
    }



    @AfterSuite (alwaysRun = true)
    public void close(){
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
