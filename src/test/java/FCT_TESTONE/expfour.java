package FCT_TESTONE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class expfour extends Basicclass
{

    @Test
    public void mouseover()
    {
        driver.get("https://jqueryui.com/droppable/");

        WebElement w= driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions a = new Actions(driver);
        Action ac = a.contextClick(w).build();
        ac.perform();

        ac.perform();
        driver.findElement(By.xpath("//div[@id='droppable']")).click();

    }


}
