package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.Config;

public class AchatProduct{
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[2]/div[3]/form/div[3]/div[1]/div[2]/button")
	WebElement acheter;
	
	@FindBy(css="button.btn.btn-secondary[data-dismiss='modal']")
	WebElement continuerAchat;
	@FindBy(id="cart-block")
	WebElement panier;
	@FindBy(xpath="/html/body/main/section/div/div/div/div/section/div/div[1]/div/div[2]/ul/li/div/div[2]/div[1]/a")
	WebElement verifAchat;
	 
	
	 public AchatProduct() {
		 PageFactory.initElements(Config.driver, this);
	 }
 public void achatProduit() throws Exception {
	 Thread.sleep(3000);
	
	 acheter.click();
	 Config.attente(10);
	 
	 
	 WebDriverWait wait= new WebDriverWait(Config.driver, Duration.ofSeconds(15));
	 wait.until(ExpectedConditions.elementToBeClickable(continuerAchat));
	 
	 continuerAchat.click();
Config.attente(10);


panier.click();
 
		 
	}

 public void  verifPanier(String productName) {
	
	Assert.assertEquals(productName, verifAchat.getText());
	 
 }
 
}