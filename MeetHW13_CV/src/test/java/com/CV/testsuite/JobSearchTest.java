package com.CV.testsuite;

import com.CV.pages.HomePage;
import com.CV.testbase.TestBase;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class JobSearchTest extends TestBase {


    HomePage homePage = new HomePage();


    @Test
    public void home(){
        homePage.verifyJobSearchResultUsingDifferentDataSet();
    }

}
