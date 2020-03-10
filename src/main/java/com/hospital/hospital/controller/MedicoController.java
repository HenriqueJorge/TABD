package com.hospital.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.hospital.entity.Medico;
import com.hospital.hospital.service.MedicoService;

@Controller
@RequestMapping("/medico")
public class MedicoController {
	
	@Autowired
	MedicoService medicoService;
	
	@PostMapping
	public ResponseEntity<Medico> create(@RequestBody Medico medico){
		return new ResponseEntity<Medico>(medicoService.create(medico),HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Medico>> readAll(){
		return new ResponseEntity<List<Medico>>(medicoService.readAll(),HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Medico> readId(@PathVariable Integer id){
		return new ResponseEntity<Medico>(medicoService.readId(id),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Medico> update(@RequestBody Medico medico){
		return new ResponseEntity<Medico>(medicoService.updade(medico),HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Medico> delete(@PathVariable Integer id){
		medicoService.delete(id);
		return new ResponseEntity<Medico>(HttpStatus.OK);
	}

}
