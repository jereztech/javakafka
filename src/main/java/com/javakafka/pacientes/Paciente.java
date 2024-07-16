package com.javakafka.pacientes;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@Builder
@With
@Entity
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paciente_seq")
	@SequenceGenerator(name = "paciente_seq", sequenceName = "paciente_seq", allocationSize = 1)
	private Integer codigo;

	private String nome;

	private String cpf;

	@Temporal(TemporalType.DATE)
	private Date dataNascimento;

}
