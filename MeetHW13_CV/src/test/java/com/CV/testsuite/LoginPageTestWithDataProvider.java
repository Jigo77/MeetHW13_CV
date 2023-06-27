package com.CV.testsuite;

import com.CV.pages.HomePage;
import com.CV.testbase.TestBase;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    //Register loginPage= new Register();



   /* @Test (dataProvider = "logindata", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){
    homePage.clickOnLoginLink();
    //loginPage.loginToApplication(username,password);

    }*/

}
