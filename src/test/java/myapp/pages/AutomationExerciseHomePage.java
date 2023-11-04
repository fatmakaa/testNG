package myapp.pages;

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationExerciseHomePage {
    // 1. create constructor
    // 2. create page objects

    public AutomationExerciseHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.=' Home']")
    public WebElement homePageLink;

    @FindBy(xpath = "//a[.=' Signup / Login']")
    public WebElement  loginButton;

    @FindBy(xpath = "//a[@href='#Women']")
    public WebElement womenCategory;

    @FindBy(xpath = "//a[@href='/category_products/1']")
    public WebElement dress;





}
