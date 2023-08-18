<<<<<<< HEAD
package servlet.controller;

import servlet.controller.component.AllMemberController;
import servlet.controller.component.FindController;
import servlet.controller.component.LoginController;
import servlet.controller.component.LogoutController;
import servlet.controller.component.RegisterController;
import servlet.controller.component.UpdateController;

public class HandlerMapping {
	
	private static HandlerMapping handler = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return handler;
	}
	
	public Controller createController(String command) {
		Controller controller = null;
		
		if(command.equals("find.do")) {
			controller = new FindController();
		} else if(command.equals("register.do")) {
			controller = new RegisterController();
		} else if(command.equals("login.do")) {
			controller = new LoginController(); 
		} else if(command.equals("allMember.do")) {
			controller = new AllMemberController();
		} else if(command.equals("logout.do")) {
			controller = new LogoutController();
		} else if(command.equals("update.do")) {
			controller = new UpdateController();
		}
		
		return controller;
	}

}


=======
package servlet.controller;

import servlet.controller.component.AllMemberController;
import servlet.controller.component.FindController;
import servlet.controller.component.LoginController;
import servlet.controller.component.LogoutController;
import servlet.controller.component.RegisterController;
import servlet.controller.component.UpdateController;

public class HandlerMapping {
	
	private static HandlerMapping handler = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return handler;
	}
	
	public Controller createController(String command) {
		Controller controller = null;
		
		if(command.equals("find.do")) {
			controller = new FindController();
		} else if(command.equals("register.do")) {
			controller = new RegisterController();
		} else if(command.equals("login.do")) {
			controller = new LoginController(); 
		} else if(command.equals("allMember.do")) {
			controller = new AllMemberController();
		} else if(command.equals("logout.do")) {
			controller = new LogoutController();
		} else if(command.equals("update.do")) {
			controller = new UpdateController();
		}
		
		return controller;
	}

}


>>>>>>> 39962ce69ee23085eb516ff40cf41f72958c13ab