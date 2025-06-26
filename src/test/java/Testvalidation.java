import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testvalidation extends BrowserLaunch

{

    @Test
    void loginvalidation()
    {
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        String appHeader= driver.findElement(By.xpath("//div[@class='product_label']")).getText();
        System.out.println("login successfully");

        Assert.assertEquals(appHeader, "Products");
        System.out.println("login successfully");







    }

}
