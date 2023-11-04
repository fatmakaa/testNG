package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage {

    //1. Create a constructor and use pagefactory ro initialize the page elements
    //2. Locate the elements using @FindBy annotation
    public OrangeHRM_LoginPage(){

       // PageFactory is used to instantiate the page objects
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // username

    @FindBy(name = "username")
    public WebElement username;

    //password
    @FindBy(name = "password")
    public WebElement password;


    // login button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement logginButton;


    //NOTE: we can create a reusable PAGE SPECIFIC method
    public void login(String userID,String pass){
        username.sendKeys(userID);
        password.sendKeys(pass);
        logginButton.click();
    }

    // DONE WITH THE PAGE OBJECTS. NOW COMPLETE YOUR TEST CASE USING THIS REUSABLE PAGE OBJECTS!!!

}
