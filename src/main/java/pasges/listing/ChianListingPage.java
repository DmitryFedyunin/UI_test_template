package pasges.listing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pasges.base.BasePage;

public class ChianListingPage extends BasePage {

    public ChianListingPage(WebDriver driver) {
        super(driver);
    }

    private final By cart = By.xpath("//article[@class='_93444fe79c--container--Povoi _93444fe79c--cont--OzgVc']");

    public ChianListingPage checkCountCarts(){
        int countCart = driver.findElements(cart).size();
        Assert.assertEquals(countCart, 28);

        return this;
    }


}
