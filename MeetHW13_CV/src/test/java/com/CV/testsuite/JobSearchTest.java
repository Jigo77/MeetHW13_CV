package com.CV.testsuite;

import com.CV.pages.HomePage;
import com.CV.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class JobSearchTest extends TestBase {


    HomePage homePage = new HomePage();

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
    }

    @Test
    public void home1() throws InterruptedException {
        homePage.iframeHandle();
    }


    @Test
    public void home() throws InterruptedException {

        homePage.verifyJobSearchResultUsingDifferentDataSet();
    }

}
