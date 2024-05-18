package springmvc_search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class handleController {
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("home calling");
		return "home";
	}
	
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int id,@PathVariable("userName") String name)
	{
		System.out.println(id);
		System.out.println(name);
		return "home";
		
	}
	
	 
	//Handling exception in our spring MVC.....
	//It will handle only NullPointerException
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull()
	{
		return "page";
		
	}
	
	//It will handle only NumberFormatException
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumberFormat()
	{
		return "page";
		
	}

	//It will handle all types of exception
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric()
	{
		return "page";
		
	}
}
