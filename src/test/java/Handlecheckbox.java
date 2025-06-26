import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Handlecheckbox extends BrowserLaunch
{
    @Test
    public void checkbox()
    {
        driver.get("https://testautomationpractice.blogspot.com/");
        WebElement contain = driver.findElement(By.xpath("//label[normalize-space()='Gender:']"));

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",contain);

        /*driver.findElement(By.xpath("//input[@id='tuesday']")).click();// this is to select for single element
        driver.findElement(By.xpath("//input[@id='monday']")).click(); //use list of webelement.for multiple.*/

        List <WebElement> options = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));

        /*for (WebElement checkbox : options)
        {
            checkbox.click();

        } // use this for multiple checkbox clicking */


        //select last three checkbox
        // total number of checkbox 7  how many checkboxes want to select
        // indexing value start from 0

        int i;

        for ( i=0; i<options.size(); i++)
        {
            options.get(i).click();
        }



    }
}
