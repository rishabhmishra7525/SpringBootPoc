package com.neosoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.neosoft.util.Common;

@Controller
public class homeController {

	@GetMapping("/")
	public String showPage(Model model) {

		model.addAttribute("labelName", Common.getService());
		return "homePage.html";
	}
}
