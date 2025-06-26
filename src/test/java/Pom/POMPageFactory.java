package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMPageFactory
{

    WebDriver driver;

    //constructor

    POMPageFactory(WebDriver d)
    {
        driver = d;
        //create this method will create element


        PageFactory.initElements(driver, this);

    }
    //identify the web elements

    //identify the username

    @FindBy(id="user-name") WebElement username;

    // identify password

    @FindBy(id="password") WebElement password;

    // identify the login button

    @FindBy(id="login-button") WebElement loginbutton;


    // create a repository to all web elements

    public void enterUsername(String Uname)
    {

        username.sendKeys("standard_user");
    }


    public void enterPassword(String pwd)
    {
        password.sendKeys("secret_sauce");

    }

    public void clickbutton()
    {
        loginbutton.click();

    }

}
