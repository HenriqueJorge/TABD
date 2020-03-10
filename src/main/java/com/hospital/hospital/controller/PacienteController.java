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

import com.hospital.hospital.entity.Paciente;
import com.hospital.hospital.service.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	PacienteService pacienteService;
	
	@PostMapping
	public ResponseEntity<Paciente> create(@RequestBody Paciente paciente){
		return new ResponseEntity<Paciente>(pacienteService.create(paciente),HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Paciente>> readAll(){
		return new ResponseEntity<List<Paciente>>(pacienteService.readAll(),HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Paciente> readId(@PathVariable Integer id){
		return new ResponseEntity<Paciente>(pacienteService.readId(id),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Paciente> update(@RequestBody Paciente paciente){
		return new ResponseEntity<Paciente>(pacienteService.update(paciente),HttpStatus.OK);
	}

	@DeleteMapping
	public ResponseEntity<Paciente> delete(@PathVariable Integer id){
		pacienteService.delete(id);
		return new ResponseEntity<Paciente>(HttpStatus.OK);
	}
}
