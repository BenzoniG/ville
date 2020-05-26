package testFonctionnels;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;  
import cucumber.api.java.en.Given;  
import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;  

public class VilleTestCucumber {
	
	private int var;

	@Given("Romeo who wants to buy a drink")
	public void romeo_who_wants_to_buy_a_drink() {
		// Write code here that turns the phrase above into concrete actions
		var = 1;
		throw new PendingException();
	}

	@When("an order is declared for Juliette")
	public void an_order_is_declared_for_Juliette() {
		// Write code here that turns the phrase above into concrete actions
		var += 1;
		throw new PendingException();
	}

	@Then("there is no cocktail in the order")
	public void there_is_no_cocktail_in_the_order() {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(1, var);
		throw new PendingException();
	}
}