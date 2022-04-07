package org.example.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends Page {

    @FindBy (xpath = "//input[@class='dz-hidden-input']")
    private WebElement hiddenUploadInput;

    @FindBy (xpath = "//input[@id='file-submit']")
    private WebElement uploadButton;

    @FindBy (xpath = "//div[@id='uploaded-files']")
    private WebElement uploadFileNameDiv;

    @FindBy (xpath = "//span[@data-dz-name]")
    private WebElement uploadFileNameSpan;

    public void openUploadPage(String url) {
        driver.get(url);
    }

    public void inputSrcFileToHiddenUpload(String link) {
        hiddenUploadInput.sendKeys(link);
    }

    public String getTextUploadFileSpan() {
        return uploadFileNameSpan.getText();
    }

}
