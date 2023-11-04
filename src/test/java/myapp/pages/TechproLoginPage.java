package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*

TechproLoginPage
userName
password
submitButton

 */
public class TechproLoginPage {

    public TechproLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//input[@id='exampleInputEmail1']")
    public WebElement userName;


    @FindBy(xpath = "//input[@id='exampleInputPassword1']")
    public WebElement password;


    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;




}
