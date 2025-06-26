import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demoscrolling

{
WebDriver driver;
@BeforeMethod
    public void launch()
{
    driver =new ChromeDriver();

    driver.get("https://www.w3schools.com/");

}
@Test
    public void scroliing()
{
    WebElement browser =driver.findElement(By.xpath("//a[@id=\"myLearningFromDefault\"]"));
    JavascriptExecutor js= (JavascriptExecutor) driver;
    js.executeScript("arguments.[0].scrollIntoView(true);",browser);
    //browser.click();
}






@AfterMethod
    public void out()
    {

    }





}
