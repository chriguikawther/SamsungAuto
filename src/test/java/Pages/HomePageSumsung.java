package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePageSumsung {
	@FindBy(xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li/a/span")
	List<WebElement> menus;
	@FindBy(xpath="/html/body/main/header/div/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/ul/li[4]/ul/li[1]/ul/li/div[1]/div/ul/li[3]/a")
	List<WebElement> submenus;
	
	@FindBy(tagName="h1")
	WebElement verifPage;

	public HomePageSumsung() {
		PageFactory.initElements(Config.driver, this);
	}
	public void mouseHover(String menuName, String submenuName) throws Exception {
		Thread.sleep(3000);
		try {
		for(WebElement menu: menus) {
			if(menu.getText().contains(menuName)) {
				
		     
				Config.actions= new Actions(Config.driver);
				Config.actions.moveToElement(menu).perform();
				Thread.sleep(3000);
				for(WebElement submenu: submenus) {
					if(submenu.getText().contains(submenuName)) {
						
						Config.attente(10);
						submenu.click();
						
							
					}
				}
				
			}
		}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	
		public void verifsubmenu(String SubmenuTitle) {
			Assert.assertEquals(SubmenuTitle, verifPage.getText());
		}
		
	}

