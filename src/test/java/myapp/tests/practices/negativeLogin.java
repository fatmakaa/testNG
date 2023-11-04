package myapp.tests.practices;

import myapp.pages.BluerRentalHomePage;
import myapp.pages.BluerRentalLoginPage;
import myapp.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class negativeLogin {
    /*
    Name:
US100208_Negative_Login
Description:
User should not be able login with incorrect credentials
Acceptance Criteria:
As customer, I should not be able to log in the application
Incorrect username and incorrect password
Customer email: fake@bluerentalcars.com
Customer password: fakepass
Error: User with email fake@bluerentalcars.com not found
     */

    @Test
    public void negativeTest() throws InterruptedException {

        Driver.getDriver().get("https://www.bluerentalcars.com/");
        BluerRentalHomePage bluerRentalHomePage = new BluerRentalHomePage();
        bluerRentalHomePage.loginButton.click();

        BluerRentalLoginPage bluerRentalLoginPage = new BluerRentalLoginPage();

        bluerRentalLoginPage.emailInput.sendKeys("fake@bluerentalcars.com");

        bluerRentalLoginPage.passwordInput.sendKeys("fakepass");

        bluerRentalLoginPage.submitButton.click();

        assertTrue(bluerRentalLoginPage.userNotFound.isDisplayed());



    }
}
