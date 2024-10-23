package TestSuite;


import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.AchatProduct;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefProduit {
	@Given("lutilisateur  est sur la page du produit")
	public void lutilisateur_est_sur_la_page_du_produit() throws Exception {
		Config.driver= new EdgeDriver();
		   Config.edge();
		   Config.maximize();
		   Config.driver.get(Utils.getproprety("Produitlink"));
	}

	@When("lutilisateur clique sur {string} et accede à la page du panier")
	public void lutilisateur_clique_sur_et_accede_à_la_page_du_panier(String string) throws Exception {
		AchatProduct produit= new AchatProduct();
		produit.achatProduit();
	}


	@Then("le produit est ajouté avec succé au panier {string}")
	public void le_produit_est_ajouté_avec_succé_au_panier(String climProduct) {
		AchatProduct produit= new AchatProduct();
		produit.verifPanier(climProduct);
	}

	

}
