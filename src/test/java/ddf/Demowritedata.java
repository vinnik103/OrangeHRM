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
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Demowritedata
{
    WebDriver driver;

    @BeforeMethod
    void launch()
    {
       // driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();

        // Preferences map
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);  // Disables password save popup
        prefs.put("profile.password_manager_enabled", false);  // Disables password manager

        options.setExperimentalOption("prefs", prefs);

        // Optional: run in incognito mode to prevent stored password prompts
        options.addArguments("--incognito");

        // Optional: start maximized
        options.addArguments("start-maximized");

        // Launch browser

        driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("http://saucedemo.com/v1/");
    }

    @Test
    public void writedata() throws IOException, InterruptedException {
        driver.get("https://www.saucedemo.com/v1/");

        File excel = new File("C:\\VinayakSCreenshot\\vindataexl.xlsx");

        FileInputStream fs = new FileInputStream(excel);

        XSSFWorkbook wb= new XSSFWorkbook(fs);

        XSSFSheet sheet = wb.getSheetAt(0);

        int rowCount = sheet.getLastRowNum();

        int totalCell =  sheet.getRow(0).getLastCellNum();

        for (int currentRow =1; currentRow<=4; currentRow++)
        {
            String username = sheet.getRow(currentRow).getCell(0).toString();
            String password = sheet.getRow(currentRow).getCell(1).toString();


            System.out.println(username);
            System.out.println(password);
            System.out.println("------------------");

          //  driver.findElement(By.xpath("//input[@id='user-name']")).clear();
            driver.findElement(By.xpath("//input[@id='user-name']")).clear();
            //driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(username);
            driver.findElement(By.xpath("//input[@id='password']")).clear();
            driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
            driver.findElement(By.xpath("//input[@id='login-button']")).click();

            Thread.sleep(3000);

            try {
                driver.findElement(By.xpath("//button[normalize-space()='Open Menu']")).click();
                Thread.sleep(2000);

                driver.findElement(By.xpath("/a[@id='logout_sidebar_link']")).click();
                Thread.sleep(2000);

                System.out.println("login may have passed for "+username);

                //create text on excel

                sheet.getRow(currentRow).createCell(2).setCellValue("passed");



            } catch (Exception e) {
                System.out.println("login may have failed for "+username);
                //throw new RuntimeException(e);
                sheet.getRow(currentRow).createCell(2).setCellValue("failed");

            }
        }
        FileOutputStream outSt = new FileOutputStream("C:\\VinayakSCreenshot\\vindataexl.xlsx");
        wb.write(outSt);
        wb.close();


    }


    @AfterMethod
    public void closePage()
    {
      // driver.quit();
    }




}
