package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.OffertPage.Parameter;
import org.openqa.selenium.Keys;

public class WorkusTask implements Task{

	private String search;
	
	public WorkusTask(String search) {
		this.search = search;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				Enter.keyValues(search).into(Parameter).thenHit(Keys.ENTER)
				
				);
	}
	public static WorkusTask searcher(String search){
		return instrumented(WorkusTask.class,search);
	}

}
