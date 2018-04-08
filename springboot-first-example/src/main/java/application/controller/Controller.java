package application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	 @RequestMapping(value = "welcome",
			    method = RequestMethod.GET)
	 public String functionNameDoesntMatter()
	 {
		 return "Welcome";
	 }
	@GetMapping("welcomeuser")
	 public String WelcomeUser(@RequestParam String name)
	 {
		 return "welcome "+name;
	 }

}
