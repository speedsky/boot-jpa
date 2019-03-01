package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView index(){
	    ModelAndView mv =new ModelAndView("index");
	    //User  user= userService.selectByPrimaryKey(26);
	    
	    //System.out.println(user.getUsername());
	    //mv.addObject("user",user);
        return mv;
    }
	
	
}
