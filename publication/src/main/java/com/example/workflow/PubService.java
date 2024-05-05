package com.example.workflow;

import org.camunda.bpm.engine.ProcessEngine;
import org.springframework.stereotype.Service;


@Service
public class PubService {
	
	private ProcessEngine engine;
	
	PubService(ProcessEngine engine)
	{this.engine=engine;}
	
	public void demarrerProcess() {
		engine.getRuntimeService().startProcessInstanceByMessage("nouvelleIdee", "pub-1");
		
	}

	public void notifierMessage() {
		engine.getRuntimeService().correlateMessage("videoEditee","pub-1");
		
	}

}
