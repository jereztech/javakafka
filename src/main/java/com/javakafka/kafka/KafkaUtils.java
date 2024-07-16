package com.javakafka.kafka;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.util.Base64Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class KafkaUtils {

	private final ObjectMapper objectMapper;

	public String serializeMessage(KafkaMessage message) throws JsonProcessingException {
		String serialized = objectMapper.writeValueAsString(message);
		return Base64Utils.encodeToString(serialized.getBytes());

	}

	public KafkaMessage deserializeMessage(String message) throws IOException {
		byte[] decoded = Base64Utils.decodeFromString(message);
		return objectMapper.readValue(decoded, KafkaMessage.class);

	}

}
