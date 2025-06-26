import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class framehwdemo extends BrowserLaunch
{
    @Test
     public void frame()

    {
     driver.get("https://demo.automationtesting.in/Frames.html");

      /* WebElement w1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
        driver.switchTo().frame(w1);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ms dhoni");*/


        driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();




    }

}
