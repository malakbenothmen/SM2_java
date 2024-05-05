package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandePetitDejeunerRepository extends JpaRepository<PetitDejeuner, Long> {
// Méthodes personnalisées si nécessaire
	
	List<PetitDejeuner> findByChambre(int ch) ;
	List<PetitDejeuner> findByCommentairesContaining(String com);
}