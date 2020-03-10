package com.hospital.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CadastroPaciente {
	
	@Id
	private int id_cadastro;
	
	private int id_paciente;
	
	private String nome;
	
	private String cpf;

	public int getId_cadastro() {
		return id_cadastro;
	}

	public void setId_cadastro(int id_cadastro) {
		this.id_cadastro = id_cadastro;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + id_cadastro;
		result = prime * result + id_paciente;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CadastroPaciente other = (CadastroPaciente) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (id_cadastro != other.id_cadastro)
			return false;
		if (id_paciente != other.id_paciente)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	

}
