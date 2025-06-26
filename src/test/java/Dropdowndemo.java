import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dropdowndemo
{
    WebDriver driver;

    @BeforeMethod
    public void dropDown()
    {
        driver = new ChromeDriver();
        driver.get("https://blazedemo.com/ ");
    }

    @Test
    public void methodDro()
    {
        Select s = new Select(driver.findElement(By.xpath("//select[@name=\"fromPort\"]")));
        s.selectByIndex(5);

        Select m = new Select(driver.findElement(By.xpath(" //select[@name='toPort']")));
        m.selectByIndex(2);

        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]")).click();






    }

    @AfterMethod
    public void closeDrop()
    {
       // driver.close();

    }



}
