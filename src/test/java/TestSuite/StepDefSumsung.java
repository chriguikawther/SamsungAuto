package TestSuite;


import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePageSumsung;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefSumsung {
	
	@Given("lutilisateur est sur la page home Sumsung")
	public void lutilisateur_est_sur_la_page_home_sumsung() throws Exception {
		Config.driver= new EdgeDriver();
		   Config.edge();
		   Config.maximize();
		   Config.driver.get(Utils.getproprety("WebHomelink"));
	}

	@When("utilisateur survole la souris sur le menu {string} et clique sur le submenu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_clique_sur_le_submenu(String Menu, String  Submenu) throws Exception {
HomePageSumsung page= new HomePageSumsung();
 page.mouseHover(Menu, Submenu);
	}
	@Then("lutilisateur se dérige vers la page de submenu {string}")
	public void lutilisateur_se_dérige_vers_la_page_de_submenu(String expectedText) {
		HomePageSumsung page= new HomePageSumsung();
		page.verifsubmenu(expectedText);
	   
	}


	}



