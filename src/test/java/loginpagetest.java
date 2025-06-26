import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpagetest
{
    WebDriver motor;


    @BeforeMethod
    public void setup()
    {
        motor = new ChromeDriver();
        motor.get("https://practicetestautomation.com/practice-test-login/");
        motor.manage().window().maximize();




    }

@Test
    public void loginpage()
{

        motor.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
        motor.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
        motor.findElement(By.xpath("//button[@id='submit']")).click();



}

@AfterMethod
    public void exitpage()
{
    //motor.close();



}


}
