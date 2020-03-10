package com.hospital.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.hospital.entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer>{

}
