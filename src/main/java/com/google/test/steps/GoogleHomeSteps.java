package com.google.test.steps;

import com.google.test.pageobjects.GoogleHomePageObject;

import net.thucydides.core.annotations.Step;

public class GoogleHomeSteps {

	GoogleHomePageObject googleHomePageObject = new GoogleHomePageObject ();
	
	@Step
	public void abrirPaginaGoogleHome() {
		googleHomePageObject.open();

	}
	
	@Step
	public void ingresarNombreLibro() {
		googleHomePageObject.ingresarNombreLibro();

	}
	
	@Step
	public void ingresarNombreLibro2() {
		googleHomePageObject.ingresarNombreLibro2();

	}
	
	@Step
	public void listaSugerida() {
		googleHomePageObject.listaSugerida();

	}
	
	@Step
	public void clickListaSugerida() {
		googleHomePageObject.clickListaSugerida();

	}
	
	@Step
	public void clickBotonGoogleSearch() {
		googleHomePageObject.clickBotonGoogleSearch();

	}
	
	@Step
	public void visualizarResultadoBusqueda() {
		googleHomePageObject.visualizarResultadoBusqueda();

	}
	
	@Step
	public void visualizarResultadoEsperado() {
		googleHomePageObject.visualizarResultadoEsperado();

	}
	
	@Step
	public void clickBotonBook() {
		googleHomePageObject.clickBotonBook();

	}
	
	@Step
	public void VisualizarTituloDelLibro() {
		googleHomePageObject.VisualizarTituloDelLibro();

	}
	
}
