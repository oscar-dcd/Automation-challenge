package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePageSophos.WorkWithUsLink;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;





public class HomePageTask implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		Actions actions = new Actions(getDriver());
		actions.sendKeys(Keys.ESCAPE);
		actions.build().perform();
		actor.attemptsTo(			
				Click.on(WorkWithUsLink)
				);	
	}
	public static HomePageTask workWith(){
		return instrumented(HomePageTask.class);
	}

}
