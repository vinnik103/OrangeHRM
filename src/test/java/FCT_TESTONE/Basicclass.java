package FCT_TESTONE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Basicclass
{
    WebDriver driver; // parent class

    @BeforeMethod
    public void setUp()
    {
        driver = new ChromeDriver();

        driver.manage().window().maximize(); //maximize your screen

    }


    @Test
    public void loginPage()
    {


    }

    @AfterMethod
    public void exitPage()
    {

    }




}
