package com.javakafka.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.javakafka.pacientes.PacienteService;

@Service
public class KafkaConsumer {

	@Autowired
	private KafkaUtils kafkaUtils;
	
	@Autowired
	private PacienteService pacienteService;

	@KafkaListener(topics = "${kafka.consumer.pacientes-topic}", groupId = "${kafka.consumer.group-id}")
	public void listen(String message) {
		try {
			KafkaMessage msg = kafkaUtils.deserializeMessage(message);
			switch (msg.getType()) {
			case UPSERT: {
				pacienteService.save(null);//convert json str to pojo
			}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
