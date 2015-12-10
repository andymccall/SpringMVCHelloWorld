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
	
	@RequestMapping(value={"/", "/index"})
	public ModelAndView index() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3> Hello World, Spring MVC</h3>Index - SpringMVCHelloWorld.java </div><br><br>";
		return new ModelAndView("index", "message", message);
		
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3> Hello World, Spring MVC</h3>About - SpringMVCHelloWorld.java </div><br><br>";
		return new ModelAndView("about", "message", message);
		
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
 
		String message =  "<br><div style='text-align:center;'>"
				+ "<h3> Hello World, Spring MVC</h3>Contact - SpringMVCHelloWorld.java </div><br><br>";
		return new ModelAndView("contact", "message", message);
		
	}
	
}