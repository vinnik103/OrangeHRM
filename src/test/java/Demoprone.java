import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoprone
{
    WebDriver driver;



    @BeforeMethod
    public void setup()
    {
        driver = new ChromeDriver();

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

@Test
public void page() throws InterruptedException {
 Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();







}
@AfterMethod
    public void exit()
{

}

}
