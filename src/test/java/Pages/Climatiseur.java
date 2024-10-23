package Pages;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class Climatiseur {
	@FindBy(xpath="/html/body/main/section/div[4]/div/div/div[2]/section/section/div[2]/div/div/div[1]/div/div/div/article/div/div[2]/div[1]/h3/a")
	List<WebElement> productList;
	
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[2]/h1")
	
	WebElement nameProduct;

	
	 public Climatiseur() {
		 PageFactory.initElements(Config.driver, this);
	 }
 public void clickProductByTheName(String productName) throws Exception {
	 Thread.sleep(3000);
	 try {
	 for(WebElement produit: productList) {
		 if(produit.getText().contains(productName)) {
			 produit.click();
		 }	
	 }
	 }catch (Exception e) {
		// TODO: handle exception
	}
	 
 }
   public void verifNameProduct(String nameClim) {
	   Assert.assertEquals(nameClim, nameProduct.getText());
}
}
