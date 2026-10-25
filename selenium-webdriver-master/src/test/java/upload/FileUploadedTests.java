package upload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadedTests extends BaseTests {
    @Test
    public void testFileupload(){
        var fileupload = homePage.clickFileUpload();
        fileupload.uploadFile("D:\\Locator Assignment.pdf");
        assertEquals(fileupload.getResultFileName(),"Locator Assignment.pdf","No PDF");
    }
}
