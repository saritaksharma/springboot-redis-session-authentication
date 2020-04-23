package com.sar.springsession.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginManagementResource {

	@RequestMapping(value="/login")
	public String login(HttpServletRequest request, HttpSession session) {

		if (!session.isNew()) {
			session.invalidate();
		}
		return "login";
	}


	@GetMapping("/logout")
	public String logout() {
		return "redirect:/login";
	}
}