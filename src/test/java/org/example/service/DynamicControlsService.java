package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.DynamicControlsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicControlsService {

    private final static String DYNAMIC_CONTROL_URL = "http://the-internet.herokuapp.com/dynamic_controls?";
    DynamicControlsPage dynamicControlsPage = new DynamicControlsPage();
    WebDriverWait wait = new WebDriverWait(DriverSingleton.getDriver(), Duration.ofSeconds(5));
    String xpathForWaiting = "//p[@id='message']";


    public void workWithCheckBox() {
        dynamicControlsPage.openDynamicControlPage(DYNAMIC_CONTROL_URL);
        dynamicControlsPage.clickOnCheckBoxButton();
        wait.until(ExpectedConditions.attributeToBe(By.xpath(xpathForWaiting),"id", "message"));
    }

    public Boolean checkVisibilityOfInput() {
        dynamicControlsPage.openDynamicControlPage(DYNAMIC_CONTROL_URL);
        return dynamicControlsPage.checkInputVisibility();
    }

    public Boolean workWithSwapInput() {
        dynamicControlsPage.openDynamicControlPage(DYNAMIC_CONTROL_URL);
        dynamicControlsPage.clickOnSwapInputButton();
        wait.until(ExpectedConditions.attributeToBe(By.xpath(xpathForWaiting), "id", "message"));
        return dynamicControlsPage.checkInputVisibility();
    }

}
