package com.google.test.stepdefinitions;

import com.google.test.steps.GoogleHomeSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GoogleSearchStepDefinitions {
	
	@Steps
	GoogleHomeSteps googleHomeSteps; 
	
	@Given("^I am on the homepage$")
	public void iMOnTheHomepage() {
		googleHomeSteps.abrirPaginaGoogleHome();
	}

	@When("^I type The name of the wind into the search field$")
	public void iTypeTheNameOfTheWindIntoTheSearchField() {
		googleHomeSteps.ingresarNombreLibro();
	 
	}

	@When("^I click the Google Search button$")
	public void iClickTheGoogleSearchButton() {
		googleHomeSteps.clickBotonGoogleSearch();
	}

	@Then("^I go to the search results page$")
	public void iGoToTheSearchResultsPage() throws InterruptedException {
		googleHomeSteps.visualizarResultadoBusqueda();
	}

	@Then("^the first result is The Name of the Wind - Patrick Rothfuss$")
	public void theFirstResultIsTheNameOfTheWindPatrickRothfuss() {
		googleHomeSteps.visualizarResultadoEsperado();
	}

	@When("^I click on the first result link$")
	public void iClickOnTheFirstResultLink() {
	    googleHomeSteps.clickBotonBook();
	}

	@Then("^I go to the Patrick Rothfuss - The Books page$")
	public void iGoToThePatrickRothfussTheBooksPage() {
		googleHomeSteps.VisualizarTituloDelLibro();
	}

}
