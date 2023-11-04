package myapp.tests.practices;

import com.github.javafaker.Faker;
import myapp.pages.AutomationExerciseHomePage;
import myapp.pages.AutomationExerciseLoginPage;
import myapp.pages.AutomationExerciseSignupPage;
import myapp.utilities.Driver;
import myapp.utilities.ExtentReportUtils;
import org.bouncycastle.pqc.jcajce.provider.Falcon;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static myapp.utilities.JSUtils.flashElement;
import static org.testng.AssertJUnit.assertTrue;

public class CreateAndDeleteAccount {
   /*
       1. Launch browser
       2. Navigate to url 'http://automationexercise.com'
       3. Verify that home page is visible successfully
       4. Click on 'Signup / Login' button
       5. Verify 'New User Signup!' is visible
       6. Enter name and email address
       7. Click 'Signup' button
       8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
       9. Fill details: Title, Name, Email, Password, Date of birth
       10. Select checkbox 'Sign up for our newsletter!'
       11. Select checkbox 'Receive special offers from our partners!'
       12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
       13. Click 'Create Account button'
       14. Verify that 'ACCOUNT CREATED!' is visible
       15. Click 'Continue' button
       16. Verify that 'Logged in as username' is visible
       17. Click 'Delete Account' button
       18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
     */

    @Test
    public void accountCreateDeleteTest() {
//        1. Launch browser
//        2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get("http://automationexercise.com");

//        3. Verify that home page is visible successfully
        AutomationExerciseHomePage automationExerciseHomePage = new AutomationExerciseHomePage();

        flashElement(automationExerciseHomePage.homePageLink);

        assertTrue(automationExerciseHomePage.homePageLink.isDisplayed());

//        4. Click on 'Signup / Login' button
        flashElement(automationExerciseHomePage.loginButton);
        automationExerciseHomePage.loginButton.click();

//        5. Verify 'New User Signup!' is visible
        AutomationExerciseLoginPage automationExerciseLoginPage = new AutomationExerciseLoginPage();
        flashElement(automationExerciseLoginPage.signupButton);
        assertTrue(automationExerciseLoginPage.signupButton.isDisplayed());

//        6. Enter name and email address
        flashElement(automationExerciseLoginPage.name);
        automationExerciseLoginPage.name.sendKeys("admin");
        flashElement(automationExerciseLoginPage.email);
        automationExerciseLoginPage.email.sendKeys("adninf4584739@gmail.com");

//        7. Click 'Signup' button
        flashElement(automationExerciseLoginPage.signupButton);
        automationExerciseLoginPage.signupButton.click();
        //REST IS HOMEWORK

//        8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        AutomationExerciseSignupPage automationExerciseSignupPage = new AutomationExerciseSignupPage();
        flashElement(automationExerciseSignupPage.verifyAccountInfo);
        assertTrue(automationExerciseSignupPage.verifyAccountInfo.isDisplayed());


//        9. Fill details: Title, Name, Email, Password, Date of birth
        Faker faker = new Faker();
        flashElement(automationExerciseSignupPage.genderMale);
        automationExerciseSignupPage.genderMale.click();

        flashElement(automationExerciseSignupPage.password);
        automationExerciseSignupPage.password.sendKeys(faker.internet().password());

        flashElement(automationExerciseSignupPage.day);
        Select selectDay = new Select(automationExerciseSignupPage.day);
        selectDay.selectByValue("13");

        flashElement(automationExerciseSignupPage.month);
        Select selectMonth = new Select(automationExerciseSignupPage.month);
        selectMonth.selectByIndex(9);

        flashElement(automationExerciseSignupPage.year);
        Select selectYear = new Select(automationExerciseSignupPage.year);
        selectYear.selectByVisibleText("2001");




//        10. Select checkbox 'Sign up for our newsletter!'
        flashElement(automationExerciseSignupPage.newsletter);
        automationExerciseSignupPage.newsletter.click();

//        11. Select checkbox 'Receive special offers from our partners!'
        flashElement(automationExerciseSignupPage.year);
        automationExerciseSignupPage.year.click();

//       12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        flashElement(automationExerciseSignupPage.firstName);
        automationExerciseSignupPage.firstName.sendKeys(faker.name().firstName());

        flashElement(automationExerciseSignupPage.lastName);
        automationExerciseSignupPage.lastName.sendKeys(faker.name().firstName());

        flashElement(automationExerciseSignupPage.company);
        automationExerciseSignupPage.lastName.sendKeys(faker.company().name());

        flashElement(automationExerciseSignupPage.address1);
        automationExerciseSignupPage.lastName.sendKeys(faker.address().fullAddress());

        flashElement(automationExerciseSignupPage.address2);
        automationExerciseSignupPage.lastName.sendKeys(faker.address().fullAddress());

        flashElement(automationExerciseSignupPage.country);
        Select select = new Select(automationExerciseSignupPage.country);
        select.selectByVisibleText("Canada");





//        13. Click 'Create Account button'
        flashElement(automationExerciseSignupPage.createAccount);
        automationExerciseSignupPage.createAccount.click();

//        14. Verify that 'ACCOUNT CREATED!' is visible
        flashElement(automationExerciseSignupPage.accountCreated);
       assertTrue(automationExerciseSignupPage.accountCreated.isDisplayed());


//        15. Click 'Continue' button
        flashElement(automationExerciseSignupPage.continueSignUp);
        automationExerciseSignupPage.continueSignUp.click();

        Driver.getDriver().navigate().refresh();
        flashElement(automationExerciseSignupPage.continueSignUp);
        automationExerciseSignupPage.continueSignUp.click();


//       16. Verify that 'Logged in as username' is visible


        flashElement(automationExerciseSignupPage.verifyLoggedInAsName);
        String verifiedName = automationExerciseSignupPage.verifyLoggedInAsName.getText();
        System.out.println("verifiedName = " + verifiedName);
       assertTrue(automationExerciseSignupPage.verifyLoggedInAsName.getText().contains(verifiedName));


//        17. Click 'Delete Account' butto

        flashElement(automationExerciseSignupPage.deleteButton);
        automationExerciseSignupPage.deleteButton.click();

//        18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        flashElement(automationExerciseSignupPage.accountDeleted);
        assertTrue(automationExerciseSignupPage.accountDeleted.isDisplayed());

        Driver.getDriver().close();

        ExtentReportUtils.pass("Driver is closed successfully");
        ExtentReportUtils.flush();


    }


}