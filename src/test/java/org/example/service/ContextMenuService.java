package org.example.service;

import org.checkerframework.checker.units.qual.A;
import org.example.driver.DriverSingleton;
import org.example.page.ContextMenuPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class ContextMenuService {

    private final static String CONTEXT_MENU_URL = "http://the-internet.herokuapp.com/context_menu";
    private ContextMenuPage contextMenuPage = new ContextMenuPage();

    Alert alert;

    public void openAlert() {
        contextMenuPage.openPage(CONTEXT_MENU_URL);
        contextMenuPage.clickToHotSpot();
    }

    public String getTextAlert() {
        alert = DriverSingleton.getDriver().switchTo().alert();
        return alert.getText();
    }

    public void closeAlert() {
        alert.accept();
    }

}
