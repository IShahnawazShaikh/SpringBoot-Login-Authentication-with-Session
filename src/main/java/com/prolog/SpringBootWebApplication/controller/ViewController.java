package com.prolog.SpringBootWebApplication.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prolog.SpringBootWebApplication.beans.NewUser;
import com.prolog.SpringBootWebApplication.dao.ServiceDao;
import com.prolog.SpringBootWebApplication.message.Response;

@Controller
public class ViewController {
	@Autowired 
	ServiceDao service ;
	NewUser user=null;
	@RequestMapping("/")
	public String indexPage( HttpServletRequest request,Model model) {
		user=(NewUser)request.getSession().getAttribute("session");
		String page="";
		if(user==null) {
			  page="loginPage";
		}
		else {
			model.addAttribute("userDetail",user);
			 page="Profile";
		}
		return page;
	}
	@RequestMapping("/register")
	public String register(Model model) {
		NewUser user=new NewUser();
		model.addAttribute("user",user);
		 return "registerPage";
	}
	@RequestMapping("/confirmPage2")
	public String confirmUser(@ModelAttribute("user") NewUser user ) {
	service.addUser(user);
	return "confirmPage2";		
	}
	
	@RequestMapping("/profile")
	public String profile( HttpServletRequest request,Model model) {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		request.getSession().setAttribute("session",user);
		String page="";
	  System.out.println(username.toLowerCase()+" : "+password.toLowerCase());	
	 user=service.findUser(username,password); 
	model.addAttribute("userDetail",user);	
	if(user.getPassword().equalsIgnoreCase(password)) {
	    	page="Profile";
	     }
	     else {
	    	  page="incorrect";               
	     }
	 return page;
	 }
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("session");          //Session remove();
	    return "loginPage";
	  }

}
