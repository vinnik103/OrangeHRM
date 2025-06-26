import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserLaunch
{
WebDriver driver; // parent class

@BeforeMethod
public void setUp()
{
    driver = new ChromeDriver();
   // driver.get("https://www.saucedemo.com/v1/"); //open new website
    driver.manage().window().maximize(); //maximize your screen
    //driver.manage().window().minimize(); //minimize your screen
   // driver.getTitle();
}


@Test
public void loginPage()
{
  // driver.findElement(By.className("form_input")).sendKeys("locked_out_user");byid//

    /*driver.findElement(By.xpath("//input[@id=\"user-name\"]")).sendKeys("standard_user");
    driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("secret_sauce"); //used to forward from login data.
    driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();*/


/*driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("secret_sauce");
driver.findElement(By.cssSelector("[value=\"LOGIN\"]")).click(); //by using css selector.*/



/*driver.findElement(By.cssSelector("input.form_input")).sendKeys("standard_user");
driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
driver.findElement(By.cssSelector("input[type=\"submit\"")).click();*/





}




@AfterMethod
public void exitPage()
{
    //driver.quit(); //to quit the application //close the browser and all tabs
    //driver.close(); //tab close only close current tab
}
}
