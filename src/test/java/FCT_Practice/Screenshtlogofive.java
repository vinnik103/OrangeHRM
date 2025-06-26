package FCT_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Screenshtlogofive extends Basicclass
{

    @Test
    public void section() throws IOException {


    driver.get("https://www.tpointtech.com/");
        WebElement ele = driver.findElement(By.xpath("//img[@id='logo']"));

        File f1 = ele.getScreenshotAs(OutputType.FILE);
        File f2 = new File("C:\\VinayakSCreenshot\\pntlogo.png");
        FileHandler.copy(f1,f2);


    }


}
