package ddf;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Checkfetchdata
{

    WebDriver driver;


    @BeforeMethod
    public void browserlaunch()
    {

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();




    }

@Test
public void democheck() throws IOException {
    // create an object of file class to open file

    File excel = new File("C:\\VinayakSCreenshot\\vindataexl.xlsx");

    // create a object of FileInputStream(excel)

    FileInputStream objFile = new FileInputStream(excel);

    // create an object of workbook XSSFWorkbook to handle the file

    XSSFWorkbook wb = new XSSFWorkbook(objFile);


    // for sheet

    XSSFSheet sheet = wb.getSheetAt(0);
   // XSSFSheet s = wb.getSheet("Readdata");

    // for row
    // get total rows count

    int rowCount = sheet.getLastRowNum()+1;


    //for cell
    //get total cell count in rows

    int totalCell = sheet.getRow(0).getLastCellNum();

// create loop for row

    for (int currentRow=0 ; currentRow< rowCount; currentRow++)
    {
        // create a inner for loop for sales


        for (int currentCell = 0; currentCell<totalCell; currentCell++)
        {
            // print the cell data means username
            // method of printing username


            //sheet.getRow(currentRow).getCell(currentCell).toString();
            System.out.print(sheet.getRow(currentRow).getCell(currentCell).toString());

            System.out.print("\t");


            //numeric value==> getNumericCellValue
            //Boolean ==> getBooleanCellValue



        }
        System.out.println("");
    }
    wb.close();


}


@AfterMethod
public void close()
{

    driver.quit();



}


}
