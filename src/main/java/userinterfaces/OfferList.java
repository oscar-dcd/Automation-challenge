package userinterfaces;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
public class OfferList {
	
	
	public static final Target theOffer = Target.the("List Offers with parameter").locatedBy("//div[@class='elementor-post__card']");
	public static final Target AllOffers = Target.the("List all the offers").locatedBy("//div[@class='premium-blog-post-outer-container colombia ofertas-laborales']");
	
	
	
	 public static void offerList(Actor actor) {	
		 
		 List<WebElementFacade> matchingElements = theOffer.resolveAllFor(actor);
		int index = 1;
		 for(WebElementFacade element: matchingElements) {		
			 System.out.println("Offer: "+index);
			 String offer = element.getText().replaceAll("No hay comentarios", "");
			 String[] offerExtracted = offer.split("\\n");		 
			 System.out.println("Name of the offer: "+offerExtracted[0]);
			 System.out.println("Publication date: "+offerExtracted[3]);
			 System.out.println("Description: "+offerExtracted[1]);
			 index = index+1;
		}	 	   
	 }
	
	 
	 public static boolean offerExists(Actor actor) {
		 if(theOffer.resolveAllFor(actor).size()>0) {
			 return true;	 
		 }else {
			 return false;
		 }
		  
	 }
	 public static void allOffers(Actor actor) {	
		 List<WebElementFacade> matchingElements = AllOffers.resolveAllFor(actor);
		int index = 1;
		 for(WebElementFacade element: matchingElements) {		
			 System.out.println("Offer: "+index);
			 String offer = element.getText().replaceAll("Ver Mas", "");
			 String[] offerExtracted = offer.split("\\n");		 
			 System.out.println("Name of the offer: "+offerExtracted[0]);
			 System.out.println("Publication date: "+offerExtracted[1]);
			 System.out.println("Description: "+offerExtracted[2]);
			 index = index+1;
		}	 
	
	 }
	 public static boolean offerAllExists(Actor actor) {
		 if(AllOffers.resolveAllFor(actor).size()>0) {
			 return true;
		 }else {
			 return false;
		 }  
	 }
	 
	 
}
	

