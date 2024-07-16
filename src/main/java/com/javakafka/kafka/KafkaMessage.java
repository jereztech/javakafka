package com.javakafka.kafka;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@Builder
@With
public class KafkaMessage {// like reducer in React

	@Enumerated(EnumType.STRING)
	private ActionType type;

	private String payload;

}
