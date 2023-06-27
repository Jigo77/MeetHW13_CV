package com.CV.testsuite;

import com.CV.pages.HomePage;
import com.CV.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {


    HomePage homePage = new HomePage();
  //  Register loginPage = new Register();

   // LoginTest loginTest = new LoginTest();

   /* @Test
    public void regform1() {
        loginPage.registerform();
    }
*/
    @Test
    public void home(){
        homePage.verifyJobSearchResultUsingDifferentDataSet();
    }

}
