package myapp.pages;
/*
TechproHomePage
homeHeader
homeLogoutButton
 */

import myapp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TechproHomePage{

     public void TechproHomePage(){
         PageFactory.initElements(Driver.getDriver(),this);
     }

     @FindBy(xpath ="//h4[1]")
    public WebElement homeHeader;

     @FindBy(xpath ="//a//i")
    public WebElement homeLogoutButton;


}
