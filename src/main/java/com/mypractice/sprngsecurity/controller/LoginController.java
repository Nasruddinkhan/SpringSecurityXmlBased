/**
 * nasru
 * LoginController.java
 * Nov 30, 2019
 */
package com.mypractice.sprngsecurity.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author nasru
 *
 */
@Controller
public class LoginController {
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String showWelcomePage(Model model, Principal principal) {
		model.addAttribute("username", principal.getName());
		return "welcome";
	}
	@RequestMapping(value = "/*", method = RequestMethod.GET)
	public String showIndexPage() {
		return "index";
	}
}
