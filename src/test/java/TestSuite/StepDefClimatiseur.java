package TestSuite;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.Climatiseur;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefClimatiseur {
	@Given("lutilisateur est sur la page climatiseur")
	public void lutilisateur_est_sur_la_page_climatiseur() throws Exception {
		Config.driver= new EdgeDriver();
		   Config.edge();
		   Config.maximize();
		   Config.driver.get(Utils.getproprety("Climatiseurlink"));
	}

	@When("lutilisateur choisit un produit {string}")
	public void lutilisateur_choisit_un_produit(String Product) throws Exception {
	    Climatiseur clim= new Climatiseur();
	    clim.clickProductByTheName(Product);
	}

	@Then("lutilisateur se dérige vers la page du produit {string}")
	public void lutilisateur_se_dérige_vers_la_page_du_produit(String x) {
		 Climatiseur clim= new Climatiseur();
		 clim.verifNameProduct(x);
	}



	

}
