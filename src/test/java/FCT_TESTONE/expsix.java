package FCT_TESTONE;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class expsix extends Basicclass
{
    @Test
    public void demoscrshot() throws IOException {

        driver.get("https://demoqa.com/");

        TakesScreenshot ts = (TakesScreenshot) driver;

        File f = ts.getScreenshotAs(OutputType.FILE);

        File fl = new File("C:\\VinayakSCreenshot\\timestampone.png");

        FileHandler.copy(f,fl);



    }



}
