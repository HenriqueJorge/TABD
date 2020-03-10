package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.entity.Paciente;
import com.hospital.hospital.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	public Paciente create(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public List<Paciente> readAll(){
		return pacienteRepository.findAll();
	}
	
	public Paciente readId(int id) {
		return pacienteRepository.findById(id).get();
	}
	
	public Paciente update(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public void delete(int id) {
		pacienteRepository.deleteById(id);
	}

}
