package com.example.demo.kafka;

import com.example.demo.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
	private static  final Logger logger = LoggerFactory.getLogger((JsonKafkaProducer.class)) ;

	private KafkaTemplate<String , User > userKafkaTemplate;

	public JsonKafkaProducer(KafkaTemplate<String , User> userKafkaTemplate)
	{
		this.userKafkaTemplate = userKafkaTemplate ;
	}

	public void sendMessage(User data)
	{
		logger.info("message to be sent: " + data.toString());
		Message<User> msg = MessageBuilder.withPayload(data).setHeader(KafkaHeaders.TOPIC , "javaguides").build();
		userKafkaTemplate.send(msg);

	}
}
