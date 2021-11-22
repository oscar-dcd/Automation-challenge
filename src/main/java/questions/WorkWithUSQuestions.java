package questions;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.OffertPage;


public class WorkWithUSQuestions {	

	
    public static Question<String> messageWork() {
    	return actor -> Text.of(OffertPage.WorkWith).viewedBy(actor).asString();
        
    }
    
   
    
}