import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class demoscreenshot extends BrowserLaunch



{
   @Test
   public void demoScreen() throws IOException {
       /*driver.get("https://www.flipkart.com/");
       // u can use interface
       TakesScreenshot ts =(TakesScreenshot) driver;
       // u can use method with takescreenshot object

       File f = ts.getScreenshotAs(OutputType.FILE);
       //visible your screenshot in respective file
       File fl = new File("C:\\VinayakSCreenshot\\page.png");

       FileHandler.copy(f,fl);*/
   }

   @Test
   public void section() throws IOException {
       driver.get("https://www.amazon.in/");
       WebElement ele = driver.findElement(By.xpath(" //a[@aria-label='PS5 Slim digital edition']//div[@class='a-section a-spacing-none _fluid-quad-image-label-v2_style_imageLabel__3ANSV aok-inline-block aok-align-center']"));
       ele.isDisplayed();

      // TakesScreenshot t= (TakesScreenshot) driver;
       File f1 = ele.getScreenshotAs(OutputType.FILE);
       File f2 = new File("C:\\VinayakSCreenshot");
       FileHandler.copy(f1,f2);


   }
}
