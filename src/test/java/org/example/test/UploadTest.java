package org.example.test;

import org.example.service.UploadService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest {

    UploadService uploadService = new UploadService();
    String fileName = "good_Job.jpg";

    @Test
    public void loadFileToHiddenInputTest() {
        uploadService.changeAttributes();
        uploadService.inputSrcFileToHiddenUpload();
        String actualNameOfUploadFile = uploadService.getActualNameOfUploadFileSpan();
        String expectedNameOfUploadFile = fileName;
        Assert.assertEquals(actualNameOfUploadFile, expectedNameOfUploadFile, "Names of files don't match!");
    }

}
