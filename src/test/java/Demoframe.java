import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demoframe extends BrowserLaunch


{

    @Test //frame1
    public void frames() {
        driver.get("https://ui.vision/demo/webtest/frames/");
        WebElement fn1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
        driver.switchTo().frame(fn1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("selenium");


        driver.switchTo().defaultContent();
        //frame2

        WebElement fn2 = driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
        driver.switchTo().frame(fn2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("welcome to frame");

        driver.switchTo().defaultContent();
        //frame3

        WebElement fn3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
        driver.switchTo().frame(fn3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("India country");

        // inner iframe part of 3 rd iframe

        driver.switchTo().frame(0); //switching to frame using index

        WebElement radioButton = driver.findElement(By.xpath("//span[text()=\"I am a human\"]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", radioButton);
        System.out.println(radioButton.getText());



        






        }





}
