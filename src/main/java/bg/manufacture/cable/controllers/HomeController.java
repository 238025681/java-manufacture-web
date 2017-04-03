package bg.manufacture.cable.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Kalin
 */
@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("")
	public String getHomePage() {
		return "home";
	}
	
	public String getContactPage() {
		
		return "contact";
	}
}
