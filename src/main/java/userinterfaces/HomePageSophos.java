package userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
@DefaultUrl("https://www.sophossolutions.com/")
public class HomePageSophos extends PageObject {
	public static final Target WorkWithUsLink = Target.the("Work With Us").located(By.linkText("Trabaja Con Nosotros"));
	
	
	
	
	
}
