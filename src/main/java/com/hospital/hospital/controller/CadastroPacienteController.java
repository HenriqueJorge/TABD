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

import com.hospital.hospital.entity.CadastroPaciente;
import com.hospital.hospital.service.CadastroPacienteService;

@Controller
@RequestMapping("/cadastro")
public class CadastroPacienteController {
	
	@Autowired
	CadastroPacienteService cadastroPacienteService;
	
	@PostMapping
	public ResponseEntity<CadastroPaciente> create(@RequestBody CadastroPaciente cadastro){
		return new ResponseEntity<CadastroPaciente>(cadastroPacienteService.create(cadastro),HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<CadastroPaciente>> readAll(){
		return new ResponseEntity<List<CadastroPaciente>>(cadastroPacienteService.readAll(),HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<CadastroPaciente> readId(@PathVariable Integer id){
		return new ResponseEntity<CadastroPaciente>(cadastroPacienteService.readId(id),HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<CadastroPaciente> update(@RequestBody CadastroPaciente cadastro){
		return new ResponseEntity<CadastroPaciente>(cadastroPacienteService.update(cadastro),HttpStatus.OK);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<CadastroPaciente> delete(@PathVariable Integer id){
		cadastroPacienteService.delete(id);
		return new ResponseEntity<CadastroPaciente>(HttpStatus.OK);
	}

}
