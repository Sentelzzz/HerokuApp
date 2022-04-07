package org.example.service;

import org.example.driver.DriverSingleton;
import org.example.page.UploadPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UploadService {

    private final static String UPLOAD_URL = "http://the-internet.herokuapp.com/upload";
    UploadPage uploadPage = new UploadPage();
    String src = "C:\\Users\\User\\IdeaProjects\\HerokuApp\\src\\test\\resources\\good_Job.jpg";
    JavascriptExecutor js = (JavascriptExecutor) DriverSingleton.getDriver();

    public void changeAttributes() {
        uploadPage.openUploadPage(UPLOAD_URL);
        js.executeScript("document.querySelector('.dz-hidden-input').setAttribute('style', 'visibility:visible')");
        js.executeScript("document.querySelector('.dz-hidden-input').setAttribute('style', 'height:100')");
        js.executeScript("document.querySelector('.dz-hidden-input').setAttribute('style', 'width: 1000')");
    }

    public void inputSrcFileToHiddenUpload() {
        uploadPage.inputSrcFileToHiddenUpload(src);
    }

    public String getActualNameOfUploadFileSpan() {
        return uploadPage.getTextUploadFileSpan();
    }
}
