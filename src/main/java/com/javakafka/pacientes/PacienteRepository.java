package com.javakafka.pacientes;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository
		extends ListCrudRepository<Paciente, Integer>, ListPagingAndSortingRepository<Paciente, Integer> {

}
