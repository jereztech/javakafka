package com.javakafka.pacientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.javakafka.kafka.KafkaMessage;
import com.javakafka.kafka.KafkaProducer;
import com.javakafka.kafka.KafkaUtils;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private PacienteService pacienteService;

	@Autowired
	private KafkaProducer kafkaProducer;

	@Autowired
	private KafkaUtils kafkaUtils;

	@GetMapping
	public List<Paciente> findAll() {
		return pacienteService.findAll();
	}

	@PostMapping("/test/message")
	public void sendMessage(@RequestBody KafkaMessage message) throws JsonProcessingException {
		kafkaProducer.sendMessage(kafkaUtils.serializeMessage(message));
	}

}
