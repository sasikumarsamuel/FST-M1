package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableExampleSteps {

	@Given("^User completes the requirement$")
	public void completeRequirement() {
		System.out.println("Given completed");
	}

	@When("^User enters the following username and password$")
	public void user_enters_and(DataTable credentials) {
		List<List<String>> creds = credentials.asLists();
		for (List<String> cred : creds) {
			for (String credential : cred) {
				System.out.println(credential);
			}
		}
		System.out.println(creds.get(1));
	}
	
	@Then("^Verify results$")
	public void verifyResults() {
		System.out.println("Verification complete");
	}
}