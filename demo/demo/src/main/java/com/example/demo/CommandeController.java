package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import jakarta.validation.Valid;

@Controller

public class CommandeController {

	
	@GetMapping("/formulaire")
	public String afficherFormulaire(Model model) {
	model.addAttribute("commande", new PetitDejeuner());
	return "formulaire";
	}
	@Autowired
	private CommandePetitDejeunerRepository commandeRepository;
	
	



	@PostMapping("/Commande")
	public String traiterCommande(@Valid @ModelAttribute("commande") PetitDejeuner commande,BindingResult res , Model model) {
		
	model.addAttribute("commande", commande);
	
	if (res.hasErrors())
		return "formulaire";
	else
	{   commandeRepository.save(commande);
    	return "recapitulatif";}
	}
}
