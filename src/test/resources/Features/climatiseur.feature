# Auteur: kawther
Feature: Climatiseur
Scenario: lutilisateur choisit un produit de la page climatiseur
Given lutilisateur est sur la page climatiseur
When lutilisateur choisit un produit "Climatiseur Samsung 9000 BTU Digital Inverter"	
Then lutilisateur se dérige vers la page du produit "Climatiseur Samsung 9000 BTU Digital Inverter"