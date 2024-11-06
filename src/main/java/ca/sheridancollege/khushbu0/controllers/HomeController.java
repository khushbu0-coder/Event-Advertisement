package ca.sheridancollege.khushbu0.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import ca.sheridancollege.khushbu0.beans.Ticket;

@Controller
public class HomeController {
	public static ArrayList<Ticket> tckts = new ArrayList<Ticket>();
	
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	@GetMapping("/add")
	public String addTicket(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "addTicket.html";
	}
	@GetMapping("/view")
	public String viewPage(Model model) {
		model.addAttribute("tickets", tckts);
		return "view.html";
	}
	
	@PostMapping("/add")
	public String addTicket(Model model, @ModelAttribute Ticket ticket) {
		tckts.add(ticket);
		
		return "redirect:/add";
	}
	
}