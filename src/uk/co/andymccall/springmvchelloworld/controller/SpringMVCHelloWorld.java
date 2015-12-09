/**
 * 
 */
package uk.co.andymccall.springmvchelloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Andy McCall
 *
 */
@Controller
public class SpringMVCHelloWorld
{
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3> Hello World, Spring MVC</h3>This message is coming from SpringMVCHelloWorld.java </div><br><br>";
		return new ModelAndView("welcome", "message", message);
		
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3> Hello World, Spring MVC</h3>This is the about page within SpringMVCHelloWorld.java </div><br><br>";
		return new ModelAndView("about", "message", message);
		
	}
	
}