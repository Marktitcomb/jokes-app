package com.mtits.jokesapp.controlllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mtits.jokesapp.services.JokeService;

@Controller
public class JokeController {
	
	public final JokeService jokeService;
	
	
	public JokeController(JokeService jokeService) {
		this.jokeService = jokeService;
		
	}
	
	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		//thymleaf front end can then access this model
		model.addAttribute("joke", jokeService.getJoke());
		
		return "index";
	}

}
