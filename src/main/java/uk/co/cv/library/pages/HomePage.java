package uk.co.cv.library.pages;

import com.aventstack.extentreports.Status;
import org.testng.Reporter;
import uk.co.cv.library.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobtitle;

    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement Location;

    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement Distance;

    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement SalaryMin;

    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement SalaryMax;

    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement SalaryTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement JobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement FindJobs;


    @CacheLookup
    @FindBy(xpath = "//button[@class = 'mat-focus-indicator solo-button mat-button mat-button-base mat-raised-button']")
    WebElement acceptCookies;



    @CacheLookup
    @FindBy(id="gdpr-consent-notice")
    WebElement iframe;
    public void switchToIframe(WebElement element){

    }
    public void clickAcceptCookies() {
        switchToIframe(iframe);
        clickOnElement(acceptCookies);
        driver.switchTo().defaultContent();
    }

    public void enterJobTitle(String jobTitle) {
        log.info("Jobtitle" + jobTitle.toString());
        sendTextToElement(this.jobtitle, jobTitle);

    }
    public void enterLocation(String location) {
        log.info("Location" + location.toString());
        sendTextToElement(this.Location, location);
    }

        public void selectDistance(String distance){
            log.info("Distance" + Distance.toString());
            selectByVisibleTextFromDropDown(Distance,distance);
        }

        public void clickOnmoreSearchOptionsLink() {
            log.info("moresearchoptionslink" + moreSearchOptionsLink.toString());
            clickOnElement(moreSearchOptionsLink);

        }
        public void enterMinSalary(String minSalary){
            log.info("salaryMin" + SalaryMin.toString());
            sendTextToElement(SalaryMin,minSalary );
        }

        public void enterMaxSalary(String maxSalary){
            log.info("salarymax" + SalaryMax.toString());
            sendTextToElement(SalaryMax, maxSalary);

        }
        public void selectSalaryType(String sType){
            log.info("SalaryType" + SalaryTypeDropDown.toString());
            selectByVisibleTextFromDropDown(SalaryTypeDropDown, "SalaryType");

        }
        public void selectJobType(String jobType){
            log.info("jobType" + JobTypeDropDown.toString());
            selectByVisibleTextFromDropDown(JobTypeDropDown, "jobType");

        }
        public void clickOnFindJobsButton() {
            log.info("FindJobs" + FindJobs.toString());
            clickOnElement(FindJobs);

        }
    }




