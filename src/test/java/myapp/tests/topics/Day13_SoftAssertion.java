package myapp.tests.topics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day13_SoftAssertion {

    @Test
    public void hardAssert(){

        /*
        Hard Assertion : if an assertion fails, then test case STOPS executing
        Assert class is used for hard assertion in TestNG
        Had assertion is more common than soft assert
         */

        System.out.println("line 14");
        Assert.assertTrue(true); //PASS so continue
        System.out.println("line 17"); //prints
        Assert.assertTrue(false); //FAILS so do not run rest of the test case
        System.out.println("line 19"); //doesn't print




    }
@Test
    public void javaAssert(){
        /*
        Java
        this is also hard assertion but this comes from java
        if this assertion fails, then test case STOP executing
        Note: We prefer
         */

}


}
