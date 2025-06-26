package FCT_TESTONE;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class expseven extends Basicclass
{


    @Test
    public void loginpage()
    {

        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");

        driver.findElement(By.cssSelector("#username")).sendKeys("student");








    }













}
