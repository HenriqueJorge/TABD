package com.hospital.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.entity.CadastroPaciente;

@Repository
public interface CadastroPacienteRepository extends JpaRepository<CadastroPaciente, Integer>{

}
