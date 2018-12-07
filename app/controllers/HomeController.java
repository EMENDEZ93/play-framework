package controllers;

import play.mvc.*;

public class HomeController extends Controller {

    public Result index() {
        render();
    }

	public String hello() {
		render("edwin");
	}    
    
}
