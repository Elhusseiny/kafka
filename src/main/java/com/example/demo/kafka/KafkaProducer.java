package com.example.demo.kafka;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaProducer {

	private KafkaTemplate<String , String > kafkaTemplate ;

	public KafkaProducer (KafkaTemplate<String , String > kafkaTemplate)
	{
		this.kafkaTemplate = kafkaTemplate ;
	}

	public void sendMessage(String message)
	{
		log.info("message to be sent: " + message);
		kafkaTemplate.send("javaguides" , message);
	}
}
