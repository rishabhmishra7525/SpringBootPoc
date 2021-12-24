package com.neosoft.controller;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neosoft.dto.FromFeild;
import com.neosoft.repo.SubjectRepo;
import com.neosoft.util.Common;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class homeController {

	@Autowired
	private SubjectRepo repo;

	@GetMapping("/")
	public String showPage(Model model) {

		List<String> experience = repo.findAllexperienceLavel();
		experience.removeIf(Objects::isNull);
		List<String> skilllable = repo.findAllSkillLavel();
		log.info(" - { } -" + experience);
		log.info(" - { } -" + skilllable);

		model.addAttribute("labelName", experience);
		model.addAttribute("skill", skilllable);

		return "homePage.html";
	}

	@PostMapping("/process")
	@ResponseBody
	public Double addBook(@RequestBody FromFeild from) {

		Double calculate = Common.calculateService(from);

		return calculate;
	}

}
