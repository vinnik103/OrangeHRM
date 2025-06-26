package FCT_Practice;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshotfive extends Basicclass
{

    @Test
    public void demoScreen() throws IOException {
        driver.get("https://ssc.nic.in/");
        // we need to use interface

        TakesScreenshot ts =(TakesScreenshot) driver;

        //u can use method with take screenshot object

        File f = ts.getScreenshotAs(OutputType.FILE);

        //path of file

        File fl = new File("C:\\VinayakSCreenshot\\mount.png");

        //visible your screenshot in respective file

        FileHandler.copy(f,fl);



    }





}
