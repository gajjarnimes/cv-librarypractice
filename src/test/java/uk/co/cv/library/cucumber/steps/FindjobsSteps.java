package uk.co.cv.library.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.cv.library.pages.HomePage;

public class FindjobsSteps {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I enter <jobtitle>$")
    public void iEnterJobtitle(String jobtitle) {
        new HomePage().enterJobTitle(jobtitle);
    }

    @And("^I select <distance>$")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("^I click on moresearchoptionslink$")
    public void iClickOnMoresearchoptionslink() {
    }

    @When("^I enter \"([^\"]*)\"$")
    public void iEnter(String salaryMin){
        new HomePage().enterMinSalary(salaryMin);

    }

    @Then("^I click on Find Jobs$")
    public void iClickOnFindJobs() {

    }

    @And("^I select salarytype\"([^\"]*)\"$")
    public void iSelect(String salarytype){
        new HomePage().selectSalaryType(salarytype);
    }

    @And("^I select jobtype\"([^\"]*)\"$")
    public void iSelect(String jobtype){
        new HomePage().selectJobType(jobtype);
    }


}

