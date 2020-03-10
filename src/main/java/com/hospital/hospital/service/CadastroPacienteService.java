package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.entity.CadastroPaciente;
import com.hospital.hospital.repository.CadastroPacienteRepository;

@Service
public class CadastroPacienteService {
	
	@Autowired
	CadastroPacienteRepository cadastroPacienteRepository;
	
	public CadastroPaciente create(CadastroPaciente cadastro) {
		return cadastroPacienteRepository.save(cadastro);
	}
	
	public List<CadastroPaciente> readAll(){
		return cadastroPacienteRepository.findAll();
	}
	
	public CadastroPaciente readId(int id) {
		return cadastroPacienteRepository.findById(id).get();
	}
	
	public CadastroPaciente update(CadastroPaciente cadastro) {
		return cadastroPacienteRepository.save(cadastro);
	}
	
	public void delete(int id) {
		cadastroPacienteRepository.deleteById(id);
	}

}
