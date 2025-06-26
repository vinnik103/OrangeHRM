package Pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutePom
{

    WebDriver driver;

    @BeforeMethod
    public void setUpApp()
    {
        WebDriverManager.chromedriver().setup(); //declaring webdriver manager
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");

    }

    @Test
    public void executeclass()
    {
        //creating object of demopom class

        Demoone dp = new Demoone(driver);

        dp.enterusername("standard_user");

        dp.enterpassword("secret_sauce");

        dp.clicklogbutton();



    }

    @AfterMethod
    public void closePage()
    {
        // driver.close();
    }
}
