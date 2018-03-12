package br.com.fiap.api.android.trabalho.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.api.android.trabalho.repository.SwitchRepository;

@CrossOrigin(origins = "*")
@RestController
public class SwitchController {
	
	@Autowired
	private SwitchRepository repository;

	@RequestMapping(value = "switch", method = RequestMethod.GET)
	public ResponseEntity<?> all(HttpServletRequest request) {
		
		return ResponseEntity.ok(repository.findFirstByOrderByCreationDateDesc());
	}
}
