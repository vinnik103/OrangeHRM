package ddf;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ddffetchdata
{

WebDriver driver;

@BeforeMethod
public void launchPage()
{
    ChromeOptions options = new ChromeOptions();

    //preference map

    Map<String, Object>prefs= new HashMap<>();
    prefs.put("credentials_enable_service",false); //disable password save popup

    prefs.put("profile.password_manager_enabled",false); //Disables password manager

    options.setExperimentalOption("prefs",prefs);

    // optional: run in incognito mode to prevent stored password prompts

    options.addArguments("--incognito");

    //optional : start maximized

    options.addArguments("start-maximized");

    //launch browser

    driver = new ChromeDriver(options);

    driver.manage().window().maximize();

    driver.get("https://www.saucedemo.com/v1/");


}


@Test
 public void practiceDemo() throws IOException, InterruptedException {

    File excel = new File("C:\\VinayakSCreenshot\\vindataexl.xlsx");

    //excel -> workbook -> sheet -> row -> cell
    //for excel
    //create an object of fileInputStream to read from file.

    FileInputStream objFile= new FileInputStream(excel);

    // create object of XSSFWorkbook to handle file
    //workbook

    XSSFWorkbook wb = new XSSFWorkbook(objFile);

    //create object of XSSFSheet to handle workbook
    //for sheet

    XSSFSheet sheet = wb.getSheetAt(0);

    //for row
    //get total row count

    int totalCell = sheet.getRow(0).getLastCellNum();

    //create for outer loop for cell

    for (int currentRow = 1; currentRow <=4; currentRow++)
    {
        String userName = sheet.getRow(currentRow).getCell(0).toString();

        String passWord = sheet.getRow(currentRow).getCell(1).toString();



    System.out.println(userName);
    System.out.println(passWord);
    System.out.println("----------------");

    driver.findElement(By.xpath("//input[@id='user-name']")).clear();
    driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(userName);
    driver.findElement(By.xpath("//input[@id='password']")).clear();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
    driver.findElement(By.xpath("//input[@id='login-button']")).click();
    Thread.sleep(3000);

    try {

        driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
        Thread.sleep(2000);


        System.out.println("login passed for:" + userName);
    } catch (Exception e) {
        System.out.println("login may have failed for:" + userName);

        throw new RuntimeException(e);

    }

    }
wb.close();

}

@AfterMethod
 public void close()
{
   // driver.quit();

}

}
