package FCT_TESTONE;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class expone extends Basicclass
{

    @Test
    public void example()
    {
        driver.get(" https://example.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='More information...']")).click();
    }


}
