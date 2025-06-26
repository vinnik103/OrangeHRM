package FCT_Practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public class Implicitwaitsix extends Basicclass
{

    @Test
    public void Testlogin()
    {


        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        driver.findElement(By.xpath("//a[normalize-space()='Log out']")).click();






    }






}
