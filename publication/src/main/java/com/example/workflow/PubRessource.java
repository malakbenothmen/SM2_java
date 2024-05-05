package com.example.workflow;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubRessource {

private PubService service ;

  PubRessource (PubService service)
  {this.service=service;}
  
  @GetMapping("/demarrer-process")
  public ResponseEntity<String> demarrerProcess()
  {
	  service.demarrerProcess();
      return ResponseEntity.ok("le process a demarer");}
  
  @GetMapping("/video-editee")
  public ResponseEntity<String> notifierVideoEditee()
  {   service.notifierMessage();
	  return ResponseEntity.ok("la notification a été envoyé ");}
}
	
