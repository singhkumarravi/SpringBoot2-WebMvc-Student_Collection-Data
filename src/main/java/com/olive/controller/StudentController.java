package com.olive.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
@RequestMapping("/std")
public class StudentController {
	
	/*
	 * here adding primitive data into model 
	 */
	
//	@GetMapping("/info")
	@RequestMapping(value="/info",method = RequestMethod.GET)
	public String fetch(Model model) {
		model.addAttribute("name", "Ravi");
		model.addAttribute("Id", "10101");
		model.addAttribute("Sal", "40000");
		System.out.println("Hitting  fetch() method..........");
		return "home";
	}
	
	/*
	 * Here adding Collection Data into Model memory
	 */
	
	@GetMapping("/data")
	public String fetchCollectionData(Model model) {
		List<String> l=new ArrayList<String>();
		        l.add("Ram");
		        l.add("Shyam");
		        l.add("Mohan");
		        l.add("Rohan");
		Set<String> l1=new HashSet<String>();
		        l1.add("Proj 1");
		        l1.add("Proj 2");
		        l1.add("Proj 3");
		        l1.add("Proj 4");  
		 Map<String,String> m=new HashMap<String, String>(); 
		 m.put("Client1", "Rohan");
		 m.put("Client2", "Mohan");
		 m.put("Client3", "Sohan");
		 m.put("Client4", "Ajit");
		model.addAttribute("l", l);
		model.addAttribute("l1", l1);
		model.addAttribute("m", m);
	
		System.out.println("Hitting  fetch() method..........");
		return "home";
	}
	

}
