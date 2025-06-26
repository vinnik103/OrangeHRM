package FCT_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scrolling_Two
{
    WebDriver driver;


    @BeforeMethod
    public void launch()
    {
        driver = new ChromeDriver();

        driver.get("https://scrollmagic.io/");



    }

    @Test
    public void scrolling()
    {

        WebElement browser= driver.findElement(By.xpath("//h3[normalize-space()='Support ScrollMagic']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("argument.[0].scrollIntoView(true);",browser);
        

    }

    @AfterMethod
    public void out()
    {

    }







}
