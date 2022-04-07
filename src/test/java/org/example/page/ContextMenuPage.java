package org.example.page;

import org.example.driver.DriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends Page {

    @FindBy (xpath = "//div[@id='hot-spot']")
    private WebElement hotSpotDiv;

    public void openContextMenuPage(String url) {
        driver.get(url);
    }

    public void clickToHotSpot() {
        Actions actions = new Actions(DriverSingleton.getDriver());
        actions.contextClick(hotSpotDiv).perform();
    }
}
