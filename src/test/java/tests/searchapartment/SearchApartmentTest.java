package tests.searchapartment;

import org.testng.annotations.Test;
import tests.base.BaseTest;

import static constans.Constant.Url.CHIAN_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    @Test
    public void checkIsRedirectToListing(){
        basePage.open(CHIAN_HOME_PAGE);

        chianHomePage.enterCountRooms().clickToFind();
        chianListingPage.checkCountCarts();
    }

}
