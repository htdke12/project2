package com.revature.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.revature.domain.GameTradeUser;
import com.revature.domain.User;
import com.revature.service.LoginService;

@Controller
@CrossOrigin(origins = "*")
public class LoginC {
	
	public LoginC(){
		System.out.println(9999999);
	}
	
@RequestMapping(value="/login", method=RequestMethod.GET)
	public void loginTest(User user) {
		
		System.out.println(887878);
	}
	
	@PostMapping("/login")
	public @ResponseBody GameTradeUser loginpost(@RequestBody GameTradeUser user) {
		LoginService service=new LoginService();
		
	
		GameTradeUser use =service.authenticate(user);
		
		
		
		return use;
	}

	@PostMapping("/register")
	public @ResponseBody void registerpost(@RequestBody GameTradeUser user) {
		LoginService service=new LoginService();
		
		service.registerUser(user);
			
	}
	
}
