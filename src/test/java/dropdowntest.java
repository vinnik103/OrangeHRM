import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dropdowntest
{

    WebDriver driver;

    @BeforeMethod

    public void setup()
    {
       driver = new ChromeDriver();
       driver.get("https://practice.expandtesting.com/dropdown");
       driver.manage().window().maximize();




    }

    @Test
    public void loginpage()
    {

        Select st = new Select(driver.findElement(By.xpath("//select[@id='country']")));
        st.selectByVisibleText("Angola");



        



    }


    @AfterMethod
    public void exitpage()
    {

       //driver.close();


    }


















}
