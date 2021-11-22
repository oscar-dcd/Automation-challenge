package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import questions.WorkWithUSQuestions;
import tasks.HomePageTask;
import tasks.WorkusTask;
import userinterfaces.HomePageSophos;
import userinterfaces.OfferList;

public class SearchItemSteps {
	private Actor actor = Actor.named("User");
	WebDriver driver;
	private HomePageSophos home;
	
	@Given("^User loads sophos solutions home screen$")
	public void user_loads_sophos_solutions_home_screen() {
			   
		System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		actor.can(BrowseTheWeb.with(driver));
		actor.wasAbleTo(Open.browserOn(home));
		
	}

	@Given("^The user enters the module Work With Us$")
	public void the_user_enters_the_module_Work_With_Us() {	 
		
	    		actor.wasAbleTo( 				
	    				HomePageTask.workWith()
	    				);    		
	}

	@Then("^The user correctly enters the Work with us section$")
	public void the_user_correctly_enters_the_Work_with_us_section() {
	  
		actor.should(seeThat("Trabaja con Nosotros",WorkWithUSQuestions.messageWork(), equalTo("Trabaja con nosotros")));
	}

	@When("^The user dont see any offers, he enter a \"([^\"]*)\"$")
	public void the_user_dont_see_any_offers_he_enter_a(String word) {
	   
		if(!OfferList.offerAllExists(actor)) {
			actor.wasAbleTo(WorkusTask.searcher(word));
			if(!OfferList.offerExists(actor)) {
				Assert.assertTrue("Error, there are no offers available for the search criteria", false);
			}
		}	
	}


	@Then("^The user prints the job offers$")
	public void the_user_prints_the_job_offers() {
		
		if(OfferList.offerAllExists(actor)) {
			OfferList.allOffers(actor);		
		}else if(OfferList.offerExists(actor)) {
			OfferList.offerList(actor);
		}
		
		}
}
