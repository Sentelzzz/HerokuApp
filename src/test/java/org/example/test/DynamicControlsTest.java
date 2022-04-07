package org.example.test;

import org.example.driver.DriverSingleton;
import org.example.service.DynamicControlsService;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControlsTest extends Base {

    private DynamicControlsService dynamicControlsService = new DynamicControlsService();
    int expectedNumberOfElementsForCheckBoxTest = 1;

    @Test
    public void checkBoxTest() {
        dynamicControlsService.workWithCheckBox();
        int actualNumberOfElements = DriverSingleton.getDriver().findElements(By.xpath("//input")).size();
        Assert.assertEquals(actualNumberOfElements, expectedNumberOfElementsForCheckBoxTest, "Number of elements doesn't match!");
    }

    @Test
    public void checkVisibilityOfInputTest() {
        dynamicControlsService.checkVisibilityOfInput();
        Boolean actualValue = dynamicControlsService.checkVisibilityOfInput();
        Assert.assertFalse(actualValue, "Window is enable!");
    }

    @Test
    public void clickOnSwapInputButtonTest() {
        dynamicControlsService.workWithSwapInput();
        Boolean actualValue = dynamicControlsService.workWithSwapInput();
        Assert.assertTrue(actualValue, "Window is disable!");
    }
}
