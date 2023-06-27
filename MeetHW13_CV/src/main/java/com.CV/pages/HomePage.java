package com.CV.pages;

import com.CV.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }// error to come alert


    By jotitle = By.xpath("//input[@id='keywords']");
    By location = By.xpath("//input[@id='location']");


    WebElement dropDown = driver.findElement(By.xpath("//select[@id='distance']"));
    By moreop = By.xpath("//button[@id='toggle-hp-search']");

    public void enterJobTitle(String jobTitle){
        sendTextToElement(jotitle,jobTitle);
    }

    public void enterLocation(String location1){
        sendTextToElement(location,location1);
    }

    public void selectDistance(String distance){

        Select select = new Select(dropDown);
        select.selectByVisibleText(distance);

    }

    public void clickOnMoreSearchOptionLink(){
        clickOnElement(moreop);
    }

    public void verifyJobSearchResultUsingDifferentDataSet(){
        enterJobTitle("Tester");
        enterLocation("Harrow");
        selectDistance("up to 5 miles");
        clickOnMoreSearchOptionLink();
    }






}
