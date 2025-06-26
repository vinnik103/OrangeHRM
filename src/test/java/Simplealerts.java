import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simplealerts extends BrowserLaunch

{

   @Test
    public void demoalt()
   {

     /*  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();

       //method accept() close alert with ok button

       driver.switchTo().alert().accept();
       Alert at = driver.switchTo().alert();

       System.out.println(at.getText());
        at.accept(); */

   }

   @Test
    public void confirmation()
   {
      /* driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       // confirmation button alert with ok and cancel button.

       driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

      // driver.switchTo().alert().accept(); //close alert using ok button

       //driver.switchTo().alert().dismiss(); // close alert using cancel

       Alert ca = driver.switchTo().alert();

       System.out.println(ca.getText());

       ca.dismiss();*/

   }


   @Test
    public void jsprompt()
   {

       driver.get("https://the-internet.herokuapp.com/javascript_alerts");

       driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();

       Alert pa = driver.switchTo().alert();
       pa.sendKeys("Thank you");

        pa.accept();
       // pa.dismiss();

        




   }


}
