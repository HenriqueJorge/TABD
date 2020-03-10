package com.hospital.hospital.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Paciente {
	
	@Id
	private int id_paciente;
	
	private int statusPaciente;
	
	@ManyToOne
	@JoinColumn(name = "id_categoria", nullable = false)
	private Medico medico;

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getStatusPaciente() {
		return statusPaciente;
	}

	public void setStatusPaciente(int statusPaciente) {
		this.statusPaciente = statusPaciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_paciente;
		result = prime * result + ((medico == null) ? 0 : medico.hashCode());
		result = prime * result + statusPaciente;
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
		Paciente other = (Paciente) obj;
		if (id_paciente != other.id_paciente)
			return false;
		if (medico == null) {
			if (other.medico != null)
				return false;
		} else if (!medico.equals(other.medico))
			return false;
		if (statusPaciente != other.statusPaciente)
			return false;
		return true;
	}
	
		

}
