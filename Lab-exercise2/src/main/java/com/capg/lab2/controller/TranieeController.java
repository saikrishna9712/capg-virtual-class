package com.capg.lab2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.lab2.model.Traniee;
import com.capg.lab2.service.TranieeService;

@Controller
public class TranieeController {
	
	@Autowired
	TranieeService service;
	
	@GetMapping("/login")
	public String login(@RequestParam("tUserName") String userName,
			@RequestParam("tPassword") String password) {
		return "login";
	}
	
	@GetMapping("")
	public String tranieeOperations() {
		return "operations";
	}
	
	
	@PostMapping("/add")
	public ModelAndView addTraniee(@ModelAttribute Traniee traniee) {
		ModelAndView mv=new ModelAndView();
		Traniee newTraniee=service.addTraniee(traniee);
		mv.addObject("traniee", newTraniee);
		mv.setViewName("add");
		return mv;
	}
	
	@DeleteMapping("/delete")
	public ModelAndView deleteTraniee(@RequestParam("tId") int id) {
		ModelAndView mv=new ModelAndView();
		Traniee traniee=service.getTranieeById(id);
		mv.addObject("traniee", traniee);
		mv.setViewName("delete");
		service.deleteTraniee(id);
		return mv;
	}
	
	@PutMapping("/update")
	public ModelAndView updateTraniee(@ModelAttribute Traniee newTraniee) {
		ModelAndView mv=new ModelAndView();
		Traniee traniee=service.updateTraniee(newTraniee);
		mv.addObject("traniee", traniee);
		mv.setViewName("update");
	    return mv;
	}
	
	@GetMapping("/get-traniee")
	public ModelAndView getTranieeById(@RequestParam("tId") int id) {
		ModelAndView mv=new ModelAndView();
		Traniee traniee=service.getTranieeById(id);
		mv.setViewName("get-traniee");
		mv.addObject("traniee", traniee);
		return mv;
	}
	
	@GetMapping("/get-all-traniee")
	public List<Traniee> getAllTraniee(){
		return service.getAllTraniees();
	}
	

}
