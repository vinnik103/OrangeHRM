import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleAlertsdemo
{

    WebDriver driver;

    @BeforeMethod
    public void setup()
    {
        driver = new FirefoxDriver();
        driver.get("https://vinothqaacademy.com/alert-and-popup/");
        driver.manage().window().maximize();

    }


    @Test
    public void openalt()
    {


            /* driver.findElement(By.xpath("//button[normalize-space()='Alert Box']")).click();
             driver.switchTo().alert().accept();
             Alert at=driver.switchTo().alert();

             System.out.println(at.getText());
             at.accept();*/


    }


    @Test
    public void confromalt()
    {

      /*  driver.findElement(By.xpath("//button[normalize-space()='Confirm Alert Box']")).click();
        Alert ca = driver.switchTo().alert();
        System.out.println(ca.getText());
        ca.dismiss();*/





    }


@Test
public void jsprompt()
{

    driver.findElement(By.xpath("//button[normalize-space()='Prompt Alert Box']")).click();

    Alert pa = driver.switchTo().alert();
    pa.sendKeys("welcome");

    //pa.accept();
    //pa.dismiss();




}




    @AfterMethod
    public void closealt()
    {


       // driver.close();



    }



}
