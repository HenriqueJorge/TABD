package com.hospital.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.hospital.entity.Medico;
import com.hospital.hospital.repository.MedicoRepository;

@Service
public class MedicoService {
	
	@Autowired
	MedicoRepository medicoRepository;
	
	public Medico create(Medico medico) {
		return medicoRepository.save(medico);
	}
	
	public List<Medico> readAll(){
		return medicoRepository.findAll();
	}
	
	public Medico readId(int id) {
		return medicoRepository.findById(id).get();
	}
	
	public Medico updade(Medico medico) {
		return medicoRepository.save(medico);
	}
	
	public void delete(int id) {
		medicoRepository.deleteById(id);
	}

}
