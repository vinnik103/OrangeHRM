package FCT_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class windowhandlethree extends Basicclass
{
    @Test
    public void multiplewindow()
    {
        driver.get("https://demo.automationtesting.in/Windows.html");

        driver.manage().window().maximize();



        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();



        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        Set<String> multiHandle= driver.getWindowHandles();


        List<String> list = new ArrayList<>(multiHandle);


        String parentId = list.get(0);
        String childId = list.get(1);


        //switch to child window

        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());

        // switch to parent window
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle());

    }
    }
