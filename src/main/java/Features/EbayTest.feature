# language: es
# encoding: iso-8859-1
Feature: Test Pagina de Ebay
	Background:
	    Given Realizar busqueda en Ebay
	    Scenario: Buscar Pilas En Ebay
	        Given la palabra a buscar es Pilas en la pagina "https://www.ebay.com/"
	        When cuando realice la busqueda
	        Then debo contar los productos encontrados en la pagina
			 