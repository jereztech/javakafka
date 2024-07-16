package com.javakafka.pacientes;

import java.util.List;

public interface PacienteService {

	List<Paciente> findAll();

	Paciente save(Paciente paciente);

}
