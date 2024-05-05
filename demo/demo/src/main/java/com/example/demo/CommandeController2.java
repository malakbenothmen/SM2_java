package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Commande")
public class CommandeController2 {

	@Autowired
	private CommandePetitDejeunerRepository commandeRepository;
	
	
	@GetMapping(path ="/" , produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<PetitDejeuner> getAll()
	{
		return commandeRepository.findAll();
	}
	
	@GetMapping(path="chambre/{ch}" , produces = {MediaType.APPLICATION_JSON_VALUE })
	public List<PetitDejeuner> getByChambre (@PathVariable int ch)
	{return commandeRepository.findByChambre(ch);}
	
	@GetMapping(path="commantaire/{com}" , produces = {MediaType.APPLICATION_JSON_VALUE })
	public List<PetitDejeuner> getByCommantaire(@PathVariable String com)
	{return commandeRepository.findByCommentairesContaining(com);}
	
	@GetMapping(path="/{id}" , produces = {MediaType.APPLICATION_JSON_VALUE })
	public PetitDejeuner getOne(@PathVariable Long id )
	{return commandeRepository.findById(id).get() ;}
	
	
	
	@PostMapping(path="/save" , produces = {MediaType.APPLICATION_JSON_VALUE })
	public PetitDejeuner save (@RequestBody PetitDejeuner p )
	{return commandeRepository.save(p);}
	
	@PutMapping (path="/edit/{id}", produces = {MediaType.APPLICATION_JSON_VALUE  })
	public PetitDejeuner update(@RequestBody PetitDejeuner p ,@PathVariable Long id )
	{
		p.setId(id);
		return commandeRepository.save(p);
	}
	
	@DeleteMapping (path="delete/{id}")
	public void delete(@PathVariable Long id )
	{
		commandeRepository.deleteById(id);
	}
	
	
	
	
	
}
