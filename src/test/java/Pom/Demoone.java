package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Demoone
{
    WebDriver driver;

    //constructor
    Demoone(WebDriver d)
    {
        driver=d;

    }

    //identify the web element
    // create a method of operation to be performed
    // locate the element

    By username = By.id("user-name");
    By password = By.id("password");
    By logbutton = By.id("login-button");


    // repository with creating methods

    public void enterusername(String uname)
    {
        driver.findElement(username).sendKeys(uname);
    }


    public void enterpassword(String pword)
    {
        driver.findElement(password).sendKeys(pword);


    }

    public void clicklogbutton()
    {
        driver.findElement(logbutton).click();

    }



}
