package com.example.demo.controller;

import com.example.demo.kafka.JsonKafkaProducer;
import com.example.demo.kafka.KafkaProducer;
import com.example.demo.payload.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class JSONMessageController {

	private JsonKafkaProducer producer;

	public JSONMessageController(JsonKafkaProducer producer) {
		this.producer = producer;
	}

	@PostMapping("/json/publish")
	public String publish(@RequestBody
			User user)
	{
		producer.sendMessage(user);
		return user.toString() ;

	}
}
