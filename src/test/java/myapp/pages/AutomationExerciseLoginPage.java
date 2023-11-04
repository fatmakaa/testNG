package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseLoginPage {
    // 1. create constructor
    // 2. create page objects

    public AutomationExerciseLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement assertVisible;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement email;


    @FindBy(xpath = "//button[.='Signup']")
    public WebElement signupButton;














}
