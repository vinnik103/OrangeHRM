import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class OrangeDemoHRM extends BrowserLaunch {
    @Test
    public void orangeHrm() throws InterruptedException {



            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();

            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();

    }
}
