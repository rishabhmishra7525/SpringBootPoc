package com.neosoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neosoft.util.Common;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class homeController {

	@GetMapping("/")
	public String showPage(Model model) {
		model.addAttribute("labelName", Common.getService());
		model.addAttribute("skill", Common.skillLave());
		
		
		return "homePage.html";
	}
	
	@GetMapping("/test")
	@ResponseBody
	public String data() {
		
		return "1/5";
	}
	
	
	@RequestMapping(value = "/profile", method = RequestMethod.GET)
	public @ResponseBody String processAJAXRequest(
	            @RequestParam("communication") String firstname,
	            @RequestParam("basicweb") String lastname   ) {
	        String response = firstname+lastname;
	        // Process the request
	        // Prepare the response string
	        return response;
	    }
	
	
}
