package com.javakafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private KafkaProperties kafkaProps;

	public void sendMessage(String message) {
		kafkaTemplate.send(kafkaProps.getConsumerPacientesTopic(), message);
	}

}
