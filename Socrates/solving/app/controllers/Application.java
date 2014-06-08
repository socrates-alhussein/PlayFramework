package controllers;
import models.Socrates;
import static play.data.Form.form;
import play.*;
import play.data.Form;
import play.mvc.*;
import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render(form(Socrates.class)));
    }
    
    public static Result solve() {
		final Form<Socrates> form = form(Socrates.class).bindFromRequest();
		if(form.hasErrors()) {
            return badRequest(index.render(form));
        } else {
        	int a =0,b=0,c=0;
        	Socrates   ss=new Socrates(0, 0, 0);
            String s = form.data().get("a");
            a = Integer.valueOf(s);
            s = form.data().get("b");
            b = Integer.valueOf(s);
            s = form.data().get("c"); 
            c = Integer.valueOf(s);
            ss.solution1(a, b,c); 
    return ok(solution.render(ss.sol));
           
    
        }
}
  
    	
}
