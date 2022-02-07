package com.sclondon.steps;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.hasItem;

import com.sclondon.tasks.AddANewContact;
import com.sclondon.tasks.OpenTheApplication;
import com.sclondon.ui.TheContacts;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.Map;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ContactStepDefinitions {
  @Before
  public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("there are no contacts named {string} in the directory")
  public void thereAreNoContactsNamedInTheDirectory(String string) {

  }

  @When("(.*) adds a new contact with the following details:")
  public void sallyAddsANewContactWithTheFollowingDetails(String actorName, Map<String, String> contact) {
    theActorCalled(actorName)
        .attemptsTo(OpenTheApplication.onTheHomePage(),
            AddANewContact.withDetails(contact));
  }


  @Then("a new contact named {string} should be added to the directory")
  public void aNewContactNamedShouldBeAddedToTheDirectory(String expectedContact) {
    theActorInTheSpotlight().should(
        seeThat(
            TheContacts.displayed(),
            hasItem(expectedContact)
        )
    );
  }
}
