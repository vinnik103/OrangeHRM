import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Browserself {

    WebDriver motor;


    @BeforeMethod
    public void setUp()
    {
        motor = new ChromeDriver();
        motor.get("https://parabank.parasoft.com/parabank/index.htm"); //it is used to open the website
        motor.manage().window().maximize(); // it is used to maximize the window. add minimize to minimize window.


    }


    @Test
    public void loginPage()
    {

    motor.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Vinayak");
    motor.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Vinayak@1212");
    motor.findElement(By.xpath("//input[@value='Log In']")).click();





    }


    @AfterMethod
    public void exitPage()
    {

       // motor.quit(); // close the browser and all tabs.

        // motor.close();  //close only current tab.

    }
}