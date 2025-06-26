import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

import static java.lang.Thread.sleep;

public class Demomouseover extends BrowserLaunch
{
    @BeforeMethod
public void rightclick()
{



}

@Test (priority = 2)
        public void doubleclick()
{

    driver.get("https://vinothqaacademy.com/mouse-event/");

    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollTo(0,document.body.scrollHeight);");

    WebElement ddb=driver.findElement(By.xpath("//button[@id='dblclick']"));
    Actions avt= new Actions(driver);
    avt.doubleClick(ddb).perform();




}


@Test(priority = 1)
public void dragdrop()
{
   driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");

    Actions act = new Actions(driver);
   WebElement sr = driver.findElement(By.xpath("//div[@id='box6']"));
   WebElement tr = driver.findElement(By.xpath("//div[@id='box106']"));
   act.dragAndDrop(sr,tr).perform();


}
@Test (priority = 2)
public void demoAction()
{
    driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

    WebElement w= driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
    Actions a = new Actions(driver);
    Action ac = a.contextClick(w).build();
    ac.perform();

    ac.perform();
    driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();




}













@AfterMethod
    public void sim()
{


}

}
