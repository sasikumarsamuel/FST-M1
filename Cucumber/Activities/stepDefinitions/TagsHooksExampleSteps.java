package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsHooksExampleSteps {
    @Before
    public void beforeAll() {
        System.out.println("Setup for all scenarios");
    }

    @After
    public void afterAll() {
        System.out.println("Tear down for all scenarios");
    }

    @Before("@First")
    public void beforeFirst() {
        System.out.println("Setup for first scenario");
    }

    @After("@First")
    public void afterFirst() {
        System.out.println("Tear down for first scenario");
    }

    @Given("^User opens a page$")
    public void userOpensPage() {
        System.out.println("Open page for Scenario");
    }

    @When("^User performs an action$")
    public void userPerformsAction() {
        System.out.println("User clicks a button");
    }

    @Then("^Do action for first scenario$")
    public void scenario1Actions() {
        System.out.println("Actions for the first scenario are executed");
    }

    @Then("^Do action for second scenario$")
    public void scenario2Actions() {
        System.out.println("Actions for the second scenario are executed");
    }

    @Then("^Do action for third scenario$")
    public void scenario3Actions() {
        System.out.println("Actions for the third scenario are executed");
    }

    @Then("^Do action for fourth scenario$")
    public void scenario4Actions() {
        System.out.println("Actions for the fourth scenario are executed");
    }
}
