package com.example.demo.kafka;

import com.example.demo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

	private static  final Logger logger = LoggerFactory.getLogger((JsonKafkaConsumer.class)) ;
	@KafkaListener(topics = "javaguides" , groupId = "myGroup")
	public void consumeMessages (User user)
	{
		logger.info("user received: " + user.toString());
	}
}
