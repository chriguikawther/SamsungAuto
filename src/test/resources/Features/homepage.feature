# Auteur: kawther
Feature: Home page Sumsung

  Scenario: Selectionner un menu de la page daccueil
    Given lutilisateur est sur la page home Sumsung
    When utilisateur survole la souris sur le menu "Électroménager" et clique sur le submenu "Climatiseur"
    Then lutilisateur se dérige vers la page de submenu "Climatiseur"
