package com.sandesh.springbootsecurity;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@GetMapping("/logout-success")
	public String logoutPage() {
		return "logout";
	}
	
	@GetMapping("/login-error")
    public String loginErrorPage() {
        return "login-error";
    }
	
//	@GetMapping("user")
//	@ResponseBody
//	public Principal user(Principal principal)
//	{
//		return principal;
//	}
	
	@GetMapping("/check-auth")
    public String checkAuthentication() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        System.out.println("Authenticated: " + authentication.isAuthenticated());
        return "auth-status";
    }
}