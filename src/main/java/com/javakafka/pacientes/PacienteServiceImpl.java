package com.javakafka.pacientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;

	public List<Paciente> findAll() {
		return pacienteRepository.findAll();
	}

	@Override
	public Paciente save(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}

}
