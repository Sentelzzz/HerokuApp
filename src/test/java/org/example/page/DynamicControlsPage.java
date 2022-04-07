package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends Page {

    @FindBy (xpath = "//button[@onclick='swapCheckbox()']")
    private WebElement checkBoxButton;

    @FindBy (xpath = "//button[@onclick='swapInput()']")
    private WebElement swapInputButton;

    @FindBy (xpath = "//input[@type='checkbox']")
    private WebElement checkBoxInput;

    @FindBy (xpath = "//p[@id='message']")
    private WebElement checkBoxMessageP;

    @FindBy (xpath = "//input[@type='text']")
    private WebElement input;

    public void clickOnCheckBoxButton() {
        checkBoxButton.click();
    }

    public void clickOnSwapInputButton() {
        swapInputButton.click();
    }

    public String getTextCheckBoxMessage() {
        return checkBoxMessageP.getText();
    }

    public void openDynamicControlPage(String url) {
        driver.get(url);
    }

    public WebElement getCheckBoxMessageP() {
        return checkBoxMessageP;
    }

    public Boolean checkInputVisibility() {
        return input.isEnabled();
    }
}
