package org.example.test;

import org.example.service.ContextMenuService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTest extends Base{

    private ContextMenuService contextMenuService = new ContextMenuService();

    @Test
    public void openContextMenuTest() {
        contextMenuService.openAlert();
        String actualResultOfAlertMessage = contextMenuService.getTextAlert();
        String expectedResultOfAlertMessage = "You selected a context menu";
        contextMenuService.closeAlert();
        Assert.assertEquals(actualResultOfAlertMessage, expectedResultOfAlertMessage, "Messages doesn't match!");
    }

}
