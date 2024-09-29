package co.com.certifications.sofka.stepdefinitions;


import co.com.certifications.sofka.tasks.Buy;
import co.com.certifications.sofka.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import java.util.List;
import java.util.Map;

import static co.com.certifications.sofka.userinterfaces.ProductsPage.TEXT_ORDER;


public class BuyStepDefinitions {
    @Given("the user enters the website")
    public void theUserEntersTheWebsite(List<Map<String, String>> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.autentication(datos));

    }

    @When("the user buys two items")
    public void theUserBuysTwoItems(List<Map<String, String>> datos) {
        OnStage.theActorInTheSpotlight().attemptsTo(Buy.dosObjetos(datos));

    }

    @Then("the user should see the purchase successfully completed")
    public void theUserShouldSeeThePurchaseSuccessfullyCompleted() {
        OnStage.theActorInTheSpotlight().attemptsTo(Ensure.that(TEXT_ORDER).isEnabled());
    }
}
