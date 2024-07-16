package com.javakafka.kafka;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

@Data
@ConfigurationProperties("kafka")
public class KafkaProperties {

	private String consumerGroupId;

	private String consumerPacientesTopic;

}
