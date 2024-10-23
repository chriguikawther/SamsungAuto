package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {
	public static WebDriver driver;
	public static Actions actions;
	public static void edge() throws Exception {
		System.setProperty("webdriver.edge.driver", Utils.getproprety("TestDriverpath"));
	}
 public static void maximize(){
	 driver.manage().window().maximize();
 }
 public static void attente(long s) {
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	 
 }
 public static void quit() {
	 driver.quit();
 }
}
