package Pom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Executepagefactory
{
    WebDriver driver;
    @BeforeMethod
    public void openApplication()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

    }
    @Test
    public void executeFactory()
    {

        POMPageFactory pf = new POMPageFactory(driver);
        pf.enterUsername("standard_user");
        pf.enterPassword("secret_sauce");
        pf.clickbutton();


    }

    @AfterMethod
    public void closeapp()
    {

        //driver.close();
    }
}
