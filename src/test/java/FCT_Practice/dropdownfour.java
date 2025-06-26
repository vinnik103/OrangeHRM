package FCT_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdownfour
{

WebDriver driver;
@BeforeMethod
  public void dropdown()
{
    driver = new ChromeDriver();
    driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

}

@Test
  public void methodDro()
{

    Select s= new Select(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")));
    s.selectByVisibleText("India");
}

@AfterMethod
 public void closedrop()
{
    //driver.close();
}





}
