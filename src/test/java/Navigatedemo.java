import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Navigatedemo extends BrowserLaunch

{
    @Test
    public void backforward() throws MalformedURLException {
       // driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       /* URL myUrl = new URL(" https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().to(myUrl); */

        driver.navigate().to("https://www.nopcommerce.com/en/demo?srsltid=AfmBOoqQLR2ojZvquyQxSWz3nP4GRLLwAzuuWmwM7OhAZq8l5o1SoEVU");

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // url printing ==> getcurrent url

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());



        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().refresh();

       //  driver.get("");   --> accept url in string format only

       // driver.navigate().to(); --> accept url in object format and string format









    }


}
