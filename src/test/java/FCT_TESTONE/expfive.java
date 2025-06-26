package FCT_TESTONE;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class expfive extends Basicclass
{

 @Test
public void dropdown()
{

    driver.get("https://demoqa.com/select-menu");

    driver.manage().window().maximize();

    Select s= new Select(driver.findElement(By.xpath("//div[@id='withOptGroup']//div[@class=' css-tlfecz-indicatorContainer']//*[name()='svg']//*[name()='path' and contains(@d,'M4.516 7.5')]")));
    s.selectByVisibleText("Group 1, option 2");


   Select st = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
   st.selectByVisibleText("Black");


}

}
