package FCT_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browserlaunch_one


{
    WebDriver driver;


    @BeforeMethod
    public void setup()
    {

        driver=new ChromeDriver(); //launch the browser

        /*driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //use for adding url

        driver.manage().window().maximize(); // use for maximize the window*/






    }

    @Test
    public void loginpage() throws InterruptedException {
       /* Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();*/


    }

    @AfterMethod
    public void exit()
    {

       // driver.quit(); // to close the all tabs
       // driver.close(); // to close current tabs


    }



}
