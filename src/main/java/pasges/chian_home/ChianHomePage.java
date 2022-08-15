package pasges.chian_home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pasges.base.BasePage;

public class ChianHomePage extends BasePage {

    public ChianHomePage(WebDriver driver) {
        super(driver);
    }

    private final By countRooms = By.xpath("//*[@id=\"frontend-mainpage\"]/section/div/div[2]/div[2]/div[1]/div[1]/div/div/div[2]/div/div[2]/button");
    private final By optionsRooms = By.xpath("//*[@id=\"frontend-mainpage\"]/section/div/div[2]/div[2]/div[1]/div[1]/div/div/div[2]/div/div[2]/div/ul[1]/li[1]/button");
    private final By findBtn = By.xpath("//*[@id=\"frontend-mainpage\"]/section/div/div[2]/div[2]/div[1]/div[1]/div/div/div[3]/span/span[2]/a");

    public ChianHomePage enterCountRooms(){
        driver.findElement(countRooms).click();
        driver.findElement(optionsRooms).click();
        return this;
    }

    public ChianHomePage clickToFind(){
        WebElement btnFind = driver.findElement(findBtn);
        waitElementIsVisible(btnFind).click();

        return this;
    }
}
