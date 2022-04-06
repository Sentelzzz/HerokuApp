package org.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DynamicControlsPage extends Page {

    @FindBy (xpath = "//button[@onclick='swapCheckbox()']")
    private WebElement buttonCheckBox;

    @FindBy (xpath = "//button[@onclick='swapInput()']")
    private WebElement buttonSwapInput;

    @FindBy (xpath = "//input[@type='checkbox']")
    private WebElement checkBox;

    @FindBy (xpath = "//p[@id='message']")
    private WebElement checkBoxMessage;

    @FindBy (xpath = "//input[@type='text']")
    private WebElement input;

    public void clickOnCheckBoxButton() {
        buttonCheckBox.click();
    }

    public void clickOnSwapInputButton() {
        buttonSwapInput.click();
    }

    public String getTextCheckBoxMessage() {
        return checkBoxMessage.getText();
    }

    public void openDynamicControlPage(String url) {
        driver.get(url);
    }

    public WebElement getCheckBoxMessage() {
        return checkBoxMessage;
    }

    public Boolean checkInputVisibility() {
        return input.isEnabled();
    }
}
