package br.com.rabbitmqsender.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rabbitmqsender.components.OrderQueueSender;

@RestController
@RequestMapping(value="/orders")
public class OrderController {

	@Autowired
	private OrderQueueSender orderQueueSender;
	
	@PostMapping
	public void send(@RequestBody String order) {
		orderQueueSender.send(order);
	}
}
