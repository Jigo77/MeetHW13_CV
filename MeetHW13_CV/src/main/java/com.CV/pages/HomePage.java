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


    By moreop = By.xpath("//button[@id='toggle-hp-search']");
    By salaryMin = By.xpath("//div[@class='hps-sal-min']/input");
    By salaryMax = By.xpath("//div[@class='hps-sal-max']/input");
    By findJobsBtn = By.xpath("//input[@id='hp-search-btn']");

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jotitle, jobTitle);
    }

    public void enterLocation(String location1) {
        sendTextToElement(location, location1);
    }

    public void selectDistance(String distance) {
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='distance']"));

        Select select = new Select(dropDown);
        select.selectByVisibleText(distance);

    }


    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreop);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(salaryMin, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        WebElement dropDown1 = driver.findElement(By.xpath("//select[@id='salarytype']"));

        Select select = new Select(dropDown1);
        select.selectByVisibleText(sType);
    }

    public void selectJobType(String jobType) {
        WebElement dropDown2 = driver.findElement(By.xpath("//select[@id='tempperm']"));

        Select select = new Select(dropDown2);
        select.selectByVisibleText(jobType);
    }

    public void clickOnFindJobsButton() {
        clickOnElement(findJobsBtn);
    }

    public void verifyJobSearchResultUsingDifferentDataSet() {

        enterJobTitle("Tester");
        enterLocation("Harrow");
        selectDistance("5 miles");
        clickOnMoreSearchOptionLink();
        enterMinSalary("30000");
        enterMaxSalary("500000");
        selectSalaryType("Per annum");
        selectJobType("Permanent");
        clickOnFindJobsButton();


    }


}
